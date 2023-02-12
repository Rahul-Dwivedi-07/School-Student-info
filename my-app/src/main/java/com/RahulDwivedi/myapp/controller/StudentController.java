package com.RahulDwivedi.myapp.controller;

import com.RahulDwivedi.myapp.model.Student;
import com.RahulDwivedi.myapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("/{rollNo}")
    public Student getStudentByRollNumber(@PathVariable int rollNo){
        return studentService.getStudentByRollNumber(rollNo);
    }
}
