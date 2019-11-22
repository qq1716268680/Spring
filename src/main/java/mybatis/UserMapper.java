package mybatis;

import jdbc.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    void insertUser(User u);
    User getUser(Integer id);
}
