package com.march.LibraryManagementSyatem.Controller;
import com.march.LibraryManagementSyatem.Entity.Student;
import com.march.LibraryManagementSyatem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("/add")
    public String addStudent(@RequestBody Student student){
    studentService.addStudent(student);
     return "Student has been added";
    }
}























