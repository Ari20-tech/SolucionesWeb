package com.VasquezRojas.service.impl;

import com.VasquezRojas.repo.IGenericRepo;
import com.VasquezRojas.service.ICoursesService;
import lombok.RequiredArgsConstructor;
import com.VasquezRojas.repo.ICoursesRepo;

import com.VasquezRojas.model.Courses;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CoursesServiceImpl extends GenericsServiceImpl<Courses, Integer> implements ICoursesService {
    private final ICoursesRepo repo;

    @Override
    protected IGenericRepo<Courses, Integer> getRepo() {
        return repo;
    }
}
