package com.kavin.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import com.kavin.student.entity.Student;
import com.kavin.student.service.StudentService;



@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    // handler method to handle list students and return mode and view
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }
    @GetMapping("/students/new")
    public String createStudentsForm(Model model){
        Student studen1=new Student();
        model.addAttribute("student", studen1);
        return "createStudent";
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.savStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String updateStudent(@PathVariable Long id,Model model){
        model.addAttribute("student", studentService.getStudent(id));
        return "editstudent";
    }
    
    @PostMapping("/students/{id}")
    public String UpdatesStudents(@PathVariable Long id, @ModelAttribute("students") Student student,Model model){
        Student exitists = studentService.getStudent(id);
        exitists.setId(id);
        exitists.setFirstname(student.getFirstname());
        exitists.setLastname(student.getLastname());
        exitists.setEmail(student.getEmail());

        studentService.updateStudent(exitists);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deletestudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "redirect:/students";
    }

}
