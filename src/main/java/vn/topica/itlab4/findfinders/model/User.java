package vn.topica.itlab4.findfinders.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class User {
    private int id;
    private String username;
    private String password;
    private String name;
    private int gender;
    private Date dateOfBirth;
    private String email;
    private String phone;
    private int isGraduated;

    public User(int id, String username, String password, String name, int gender, Date dateOfBirth, String email, String phone, int isGraduated) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phone = phone;
        this.isGraduated = isGraduated;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIsGraduated() {
        return isGraduated;
    }

    public void setIsGraduated(int isGraduated) {
        this.isGraduated = isGraduated;
    }
}
