package transaction;


import jdbc.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRED)
public interface ILogin {
    String loginCheck(String userName, String password);

    void save(User u) ;

    List<User> queryUser();

    User queryOne();
}
