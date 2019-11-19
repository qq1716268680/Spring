package transaction;


import jdbc.User;

public interface ILogin {
    String loginCheck(String userName, String password);

    void save(User u) ;
}
