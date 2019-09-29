package vn.topica.itlab4.findfinders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import vn.topica.itlab4.findfinders.DAO.UserDAO;
import vn.topica.itlab4.findfinders.common.Utils;
import vn.topica.itlab4.findfinders.model.ListUser;
import vn.topica.itlab4.findfinders.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RESTController {

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Valid @ModelAttribute("user") User user, BindingResult result, ModelMap model){
        if(result.hasErrors()){
            return "error";
        }
        model.addAttribute("name",user.getName());
        model.addAttribute("username",user.getUsername());
        model.addAttribute("password",user.getPassword());
        model.addAttribute("email",user.getEmail());
        model.addAttribute("phone",user.getPhone());
        return "homepage";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam("username")String username, @RequestParam("password") String password, HttpServletRequest request){
        ListUser listUser = ListUser.getInstance();

        for(User u: listUser.getListUser()) {
            System.out.println(u.getName());
            if(u.getUsername().equals(username)&&u.getPassword().equals(password)) {
                request.getSession().setAttribute("username", u.getName());
                System.out.println("login successfully");
                return "homepage";
            }else{
                return "login";
            }
        }
        return "login";
//        if(userDAO.checkLogin(username,password)){
//            return "homepage";
//        }else{
//            return "login";
//        }
    }
}
