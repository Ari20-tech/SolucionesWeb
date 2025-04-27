package com.VasquezRojas.controller;

import com.VasquezRojas.model.Courses;
import com.VasquezRojas.service.ICoursesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Courses findById(@PathVariable("id") Integer id) throws Exception{
        return service.findById(id);
    }

    @PostMapping
    public Courses save(@RequestBody Courses courses) throws Exception{
        return service.save(courses);
    }

    @PutMapping("/{id}")
    public Courses update(@PathVariable("id") Integer id, @RequestBody Courses courses) throws Exception{
        return service.update(courses, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception{
        service.delete(id);
    }
}
