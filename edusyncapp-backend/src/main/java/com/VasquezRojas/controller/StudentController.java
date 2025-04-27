package com.VasquezRojas.controller;

import com.VasquezRojas.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import com.VasquezRojas.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/estudiante")
public class StudentController {
    private final IStudentService service;

    @GetMapping
    public List<Student> findAll() throws Exception{
        return service.findAll();
    }
}
