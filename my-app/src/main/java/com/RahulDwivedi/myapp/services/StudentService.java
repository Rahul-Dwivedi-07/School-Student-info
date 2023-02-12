package com.RahulDwivedi.myapp.services;

import com.RahulDwivedi.myapp.model.Student;
import org.springframework.context.annotation.Bean;

public interface StudentService {
    Student getStudentByRollNumber(int rollNo);

    Student save(Student student);
}
