package com.RahulDwivedi.myapp.services;

import com.RahulDwivedi.myapp.entity.StudentEntity;
import com.RahulDwivedi.myapp.model.Student;
import com.RahulDwivedi.myapp.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getStudentByRollNumber(int rollNo) {
        StudentEntity studentEntity = studentRepository.findById(rollNo).get();
        Student student = new Student();
        BeanUtils.copyProperties(studentEntity,student);
        return student;
    }

    @Override
    public Student save(Student student) {
        StudentEntity entity = new StudentEntity();
        BeanUtils.copyProperties(student,entity);
        studentRepository.save(entity);
        return student;
    }

}
