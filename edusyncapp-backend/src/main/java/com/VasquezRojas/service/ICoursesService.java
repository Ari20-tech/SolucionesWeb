package com.VasquezRojas.service;
import com.VasquezRojas.model.Courses;

import java.util.List;

public interface ICoursesService {
    Courses save(Courses courses) throws Exception;
    Courses update(Courses courses, Integer id) throws Exception;
    List<Courses> findAll() throws Exception;
    Courses findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}
