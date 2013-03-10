package com.next.base;

import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author zhouhui
 */
public class DatabaseUtil {

    private static SqlSessionFactory sqlSessionFactory = null;
    private static SqlSession sqlSession = null;

    private DatabaseUtil() {
    }

    private static void createSqlSessionFactory() throws Exception {
        if (sqlSessionFactory == null) {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
    }

    public static List query(String sqlId, Object parameter) {
        List resultList;
        resultList = sqlSession.selectList(sqlId, parameter);
        return resultList;
    }

    public static int insert(String sqlId, Object parameter) {
        int ret = 0;
        ret = sqlSession.insert(sqlId, parameter);
        return ret;
    }

    public static int update(String sqlId, Object parameter) {
        int ret = 0;
        ret = sqlSession.update(sqlId, parameter);
        return ret;
    }
    
    public static <T extends Object> T getMapper(Class<T> type) {
        return sqlSession.getMapper(type);
    }

    public static void startTransaction() throws Exception {
        createSqlSessionFactory();
        if (sqlSession == null) {
            sqlSession = sqlSessionFactory.openSession();
        }
    }

    public static void commit() {
        sqlSession.commit();
    }

    public static void rollback() {
        sqlSession.rollback();
    }

    public static void endTransaction(boolean isCommit) {
        try {
            if (isCommit) {
                commit();
            } else {
                rollback();
            }
        } finally {
            sqlSession.close();
            sqlSession = null;
        }
    }
}