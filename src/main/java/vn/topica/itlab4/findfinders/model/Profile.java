package vn.topica.itlab4.findfinders.model;

public class Profile {
    private int id;
    private String major;
    private String companies;
    private int year_experienced;
    private String skills;
    private int id_user;

    public Profile(String major, String companies, int year_experienced, String skills, int id_user) {
        this.major = major;
        this.companies = companies;
        this.year_experienced = year_experienced;
        this.skills = skills;
        this.id_user = id_user;
    }

    public Profile() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCompanies() {
        return companies;
    }

    public void setCompanies(String companies) {
        this.companies = companies;
    }

    public int getYear_experienced() {
        return year_experienced;
    }

    public void setYear_experienced(int year_experienced) {
        this.year_experienced = year_experienced;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
}
