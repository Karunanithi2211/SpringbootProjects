package com.nivak.demoweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nivak.demoweb.dao.UserDAO;
import com.nivak.demoweb.model.UserSt;


@Controller
public class controller {

    @Autowired
    UserDAO userdao;

    @RequestMapping("/")
    public String index(){
        return "user.jsp";
    }
    @RequestMapping("addUser")
    public String addUser(UserSt user){
        userdao.save(user);
        return "user.jsp";
    }
    
    @RequestMapping("getUser")
    public ModelAndView getUser(@RequestParam int id){
        ModelAndView mav = new ModelAndView("show.jsp");
        UserSt user = userdao.findById(id).orElse(null);
        String str = "kavin";
        mav.addObject("user",user);
        mav.addObject("users",str);
        return mav;
    }
    
    @RequestMapping("delUser")
    public ModelAndView delUser(@RequestParam int id){
        ModelAndView mav = new ModelAndView("user.jsp");
        userdao.deleteById(id);
        return mav;
    }
    
}
