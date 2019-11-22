package transaction;



import jdbc.User;
import jdbc.UserRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

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
            jdbcTemplate.update("insert into user(name,age,sex ) values (?,?,?)",
                    new Object[]{u.getName(),u.getAge(),u.getSex()}
                    ,new int[]{Types.VARBINARY,Types.INTEGER,Types.VARCHAR}
                    );
         throw new RuntimeException("aa");
    }

    @Override
    public List<User> queryUser() {
        return jdbcTemplate.query("select * from user where age = ? ",new Object[]{20},new int[]{Types.INTEGER},new UserRowMapper());
    }

    @Override
    public User queryOne() {
        return jdbcTemplate.queryForObject("select * from user",new UserRowMapper());
    }

}
