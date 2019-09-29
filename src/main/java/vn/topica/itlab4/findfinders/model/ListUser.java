package vn.topica.itlab4.findfinders.model;

import vn.topica.itlab4.findfinders.common.Utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ListUser {
    private List<User> listUser = new ArrayList<User>();
    private static ListUser instance;

    public static ListUser getInstance() {
        if (instance == null) {
            instance = new ListUser();
        }
        return instance;
    }

    public ListUser(){
        try {
            listUser.add(new User(1,"tuanh","tuanh","tuanh",1, Utils.stringToDate("24/10/1997"),"anhlt14@topica.edu.vn","0969969969",1));
            listUser.add(new User(2,"ronaldo","ronaldo","ronaldo",1, Utils.stringToDate("24/10/1985"),"ronaldo@topica.edu.vn","0969969969",1));
            listUser.add(new User(3,"messi","messi","messi",1, Utils.stringToDate("24/10/1987"),"messi@topica.edu.vn","0969969969",0));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public List<User> getListUser() {
        return listUser;
    }
}
