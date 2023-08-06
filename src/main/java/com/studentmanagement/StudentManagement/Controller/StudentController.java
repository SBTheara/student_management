package com.studentmanagement.StudentManagement.Controller;

import com.studentmanagement.StudentManagement.Entity.Student;
import com.studentmanagement.StudentManagement.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Handler method to handle list student and return mode and view
    @GetMapping("/getallstudent")
    public String listStudent(Model model){
        model.addAttribute("student",studentService.getallStudent());
        return "student";
    }
    @GetMapping("/student/new")
    public String createStudentForm(Model model){

        //create student object to hold student form data
        Student student = new Student();
        model.addAttribute("student", student);
        return "creat_student";
    }
    @PostMapping("/post")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/student";
    }
    @GetMapping("/student/update/{id}")
    public String updateStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student",studentService.getStudentID(id));
        return "update_student";
    }
    @PostMapping("/student/{id}")
    public String updateStudent(@PathVariable Long id ,@ModelAttribute("student") Student student,Model model){
        // get student from database by id
        Student exitstingStudent = studentService.getStudentID(id);
        exitstingStudent.setId(id);
        exitstingStudent.setFirstname(student.getFirstname());
        exitstingStudent.setLastname(student.getLastname());
        exitstingStudent.setEmail(student.getEmail());
        // save updated student object
        studentService.updateStudent(exitstingStudent);
        return "redirect:/student";
    }

    @GetMapping("/student/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deletebyid(id);
        return "redirect:/student";
    }
}
