package jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User u = new User();
        u.setName(rs.getString("name"));
        u.setAge(rs.getInt("age"));
        u.setSex(rs.getString("sex"));
        return u;
    }
}
