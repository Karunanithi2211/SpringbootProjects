package com.kavin.bootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kavin.bootjpa.dao.AlienRepo;
import com.kavin.bootjpa.model.Alien;

@Controller
public class AlienController {
    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien){
        repo.save(alien);
        return "home.jsp";
    }

    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid){
        ModelAndView mv = new ModelAndView("show.jsp");
        Alien alien=repo.findById(aid).orElse(new Alien());
        mv.addObject("obj",alien);
        return mv;
    }

    @RequestMapping("/back")
    public String back(){
        return "home.jsp";
    }

}
