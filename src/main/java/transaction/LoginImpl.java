package transaction;



import jdbc.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;

public class LoginImpl implements ILogin {
    String id = "";

    private JdbcTemplate jdbcTemplate;

    public void setId(String id) {
        this.id = id;
    }

    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public String loginCheck(String userName, String password) {
        System.out.println("boy登录...");
        return "success";
    }

    public void save(User u)  {
        try {
            jdbcTemplate.update("insert into user(name,age,sex ) values (?,?,?)",
                    new Object[]{u.getName(),u.getAge(),u.getSex()}
                    ,new int[]{Types.VARBINARY,Types.INTEGER,Types.VARCHAR}
                    );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
