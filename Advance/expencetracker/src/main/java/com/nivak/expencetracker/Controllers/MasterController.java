package com.nivak.expencetracker.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nivak.expencetracker.Entity.Expenses;
import com.nivak.expencetracker.Services.ExpenseService;


@Controller
public class MasterController {

    @Autowired
    ExpenseService expenseService;

    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("Home");
        List<Expenses> expenses = expenseService.findAll();
        mav.addObject("expenses", expenses);
        return mav;
    }

    @RequestMapping("/addexpense")
    public ModelAndView addExpense(){
        ModelAndView mav = new ModelAndView("AddExpense");
        mav.addObject("expense", new Expenses());
        return mav;
    }

    @RequestMapping(value = "/expense", method = RequestMethod.POST)
    public String save(@ModelAttribute("expense") Expenses expenses){
        expenseService.save(expenses);
        return "redirect:/";
    }

    @RequestMapping(value = "/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id){
        ModelAndView mav = new ModelAndView("AddExpense"); 
        Expenses expenses = expenseService.findById(id);
        mav.addObject("expense", expenses);
        return mav;
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        expenseService.delete(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/login")
    public ModelAndView Login(){
        ModelAndView mav = new ModelAndView("Login");
        return mav;
    }

    @RequestMapping(value = "/logined", method = RequestMethod.POST)
    public String Logined(){
        return "redirect:/";
    }
    @RequestMapping(value = "/register")
    public ModelAndView Register(){
        ModelAndView mav = new ModelAndView("Register");
        return mav;
    }
    @RequestMapping(value = "/registered", method = RequestMethod.POST)
    public String Registered(){
        return "redirect:/";
    }

}
