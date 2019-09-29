package vn.topica.itlab4.findfinders.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.topica.itlab4.findfinders.model.User;
import vn.topica.itlab4.findfinders.model.UserMapper;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class UserDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    List<User> listUser = new ArrayList<User>();

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void insertUser(String username, String password, String name, int gender, Date dateOfBirth, String email, String phone, int isGraduated) {
        String query = "insert into candidate (user_name, password, name, gender, dob, email, phone, is_graduated) values (?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplateObject.update(query, username, password, name, gender, dateOfBirth, email, phone, isGraduated);
        System.out.println("Created Record Name = " + name);
        return;
    }


    public List<User> getListUser() {
        String query = "select * from candidate";

        return listUser;
    }

    public boolean checkLogin(String username, String password){
        String query = "select * from candidate where user_name = '"+username+"' and password = '"+password+"'";
        List<User> list = jdbcTemplateObject.query(query, new UserMapper());
        if(list.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
