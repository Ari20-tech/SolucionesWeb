package com.VasquezRojas.repo;
import com.VasquezRojas.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICoursesRepo extends JpaRepository<Courses, Integer> {
}
