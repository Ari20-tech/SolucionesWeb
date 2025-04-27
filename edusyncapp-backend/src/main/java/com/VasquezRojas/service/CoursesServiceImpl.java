package com.VasquezRojas.service;

import lombok.RequiredArgsConstructor;
import com.VasquezRojas.repo.ICoursesRepo;
import org.springframework.stereotype.Service;
import com.VasquezRojas.model.Courses;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoursesServiceImpl implements ICoursesService {
    private final ICoursesRepo repo;

    @Override
    public Courses save(Courses courses) throws Exception {
        return repo.save(courses);
    }

    @Override
    public Courses update(Courses courses, Integer id) throws Exception {
        return repo.save(courses);
    }

    @Override
    public List<Courses> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Courses findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Courses());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
