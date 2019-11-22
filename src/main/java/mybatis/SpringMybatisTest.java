package mybatis;

import jdbc.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import transaction.ILogin;

public class SpringMybatisTest {
    public static void main(String[] args) {
        String XMLPath = "spring-mybatis.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:"+XMLPath);
        UserMapper userDao  = (UserMapper) applicationContext.getBean("userMapper");


        System.out.println(userDao.getUser(1));
    }
}
