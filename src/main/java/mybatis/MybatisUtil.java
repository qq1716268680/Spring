package mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class MybatisUtil {
    private final static SqlSessionFactory sqlSessionFactory;

    static {
        String resource = "mybatis-config2.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resource);
        }catch (Exception e){
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }

    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }



}
