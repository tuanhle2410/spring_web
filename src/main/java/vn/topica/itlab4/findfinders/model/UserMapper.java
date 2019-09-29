package vn.topica.itlab4.findfinders.model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import org.springframework.jdbc.core.RowMapper;
import vn.topica.itlab4.findfinders.common.Utils;

public class UserMapper implements RowMapper<User>{
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user= new User();
        user.setId(rs.getInt("id"));
        user.setUsername(rs.getString("user_name"));
        user.setPassword(rs.getString("password"));
        user.setName(rs.getString("name"));
        user.setGender(rs.getInt("gender"));
        user.setDateOfBirth(rs.getDate("dob"));
        user.setEmail(rs.getString("email"));
        user.setPhone(rs.getString("phone"));
        user.setIsGraduated(rs.getInt("is_graduated"));
        return user;
    }
}