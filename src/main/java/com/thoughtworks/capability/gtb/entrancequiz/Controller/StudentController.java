package com.thoughtworks.capability.gtb.entrancequiz.Controller;

import com.thoughtworks.capability.gtb.entrancequiz.Model.Student;
import com.thoughtworks.capability.gtb.entrancequiz.Service.StudentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    @CrossOrigin
    public List<Student> findAllStudents() {
        return studentService.findAll();
    }

}
