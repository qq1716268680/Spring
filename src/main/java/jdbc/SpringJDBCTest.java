package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import transaction.ILogin;

public class SpringJDBCTest {
    public static void main(String[] args) {
        String XMLPath = "spring-config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:"+XMLPath);
        ILogin login = (ILogin) applicationContext.getBean("loginService");

        User u = new User();
        u.setName("张三");
        u.setAge(20);
        u.setSex("男");

//        login.loginCheck("boy", "123");
        login.save(u);
    }
}
