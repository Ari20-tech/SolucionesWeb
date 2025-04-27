package com.VasquezRojas.repo;
import com.VasquezRojas.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student, Integer>{
}
