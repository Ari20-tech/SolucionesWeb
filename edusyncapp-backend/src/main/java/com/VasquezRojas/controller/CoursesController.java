package com.VasquezRojas.controller;

import com.VasquezRojas.model.Courses;
import com.VasquezRojas.service.ICoursesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cursos")
public class CoursesController {
    private final ICoursesService service;

    @GetMapping
    public List<Courses> findAll() throws Exception{
        return service.findAll();
    }
}
