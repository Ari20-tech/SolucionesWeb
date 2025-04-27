package com.VasquezRojas.service.impl;

import com.VasquezRojas.model.Student;
import com.VasquezRojas.repo.IGenericRepo;
import com.VasquezRojas.repo.IStudentRepo;
import com.VasquezRojas.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl extends GenericsServiceImpl<Student, Integer> implements IStudentService {
    private final IStudentRepo rep;

    @Override
    protected IGenericRepo<Student, Integer> getRepo() {
        return rep;
    }
}
