package mybatis;

import jdbc.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;

public class TestMapper{
    static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }

    @Test
    public void testAd(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User u = new User("tom",new Integer(5));
            userMapper.insertUser(u);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }

    }

    @Test
    public void testGetUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User u = userMapper.getUser(1);
            System.out.println(u.getName());
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }

    }
}
