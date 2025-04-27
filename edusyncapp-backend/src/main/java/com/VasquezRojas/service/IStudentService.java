package com.VasquezRojas.service;
import com.VasquezRojas.model.Student;

import java.util.List;

public interface IStudentService {
    Student save(Student student) throws Exception;
    Student update(Student student, Integer id) throws Exception;
    List<Student> findAll() throws Exception;
    Student findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}
