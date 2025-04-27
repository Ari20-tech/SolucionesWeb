package com.VasquezRojas.controller;

import com.VasquezRojas.model.Courses;
import com.VasquezRojas.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.VasquezRojas.model.Student;

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

    @GetMapping("/{id}")
    public Student findById(@PathVariable("id") Integer id) throws Exception{
        return service.findById(id);
    }

    @PostMapping
    public Student save(@RequestBody Student student) throws Exception{
        return service.save(student);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable("id") Integer id, @RequestBody Student student) throws Exception{
        return service.update(student, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception{
        service.delete(id);
    }
}
