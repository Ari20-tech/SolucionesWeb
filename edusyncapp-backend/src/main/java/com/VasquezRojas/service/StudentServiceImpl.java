package com.VasquezRojas.service;

import com.VasquezRojas.model.Student;
import com.VasquezRojas.repo.IStudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService {
    private final IStudentRepo rep;
    @Override
    public Student save(Student student) throws Exception {
        return rep.save(student);
    }

    @Override
    public Student update(Student student, Integer id) throws Exception {
        student.setIdStudent(id);
        return rep.save(student);
    }

    @Override
    public List<Student> findAll() throws Exception {
        return rep.findAll();
    }

    @Override
    public Student findById(Integer id) throws Exception {
        return rep.findById(id).orElse(new Student());
    }

    @Override
    public void delete(Integer id) throws Exception {
        rep.deleteById(id);
    }
}
