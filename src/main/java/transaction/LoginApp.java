package transaction;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LoginApp {
    public static void main(String[] args) {
        String XMLPath = "spring-config.xml";
        ApplicationContext applicationContext = null;
//        applicationContext = new FileSystemXmlApplicationContext("D:\\workspace2\\spring-framework\\SpringDemo\\src\\main\\resources\\"+XMLPath);
        applicationContext = new ClassPathXmlApplicationContext("classpath:"+XMLPath);
        ILogin login = (ILogin) applicationContext.getBean("loginService");
        login.loginCheck("boy", "123");
    }
}
