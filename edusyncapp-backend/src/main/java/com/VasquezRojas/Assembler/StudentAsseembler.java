package com.VasquezRojas.Assembler;

import com.VasquezRojas.DTO.StudentDTO;
import com.VasquezRojas.controller.CoursesController;
import com.VasquezRojas.controller.StudentController;
import com.VasquezRojas.model.Student;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

@Component
public class StudentAsseembler {
    public EntityModel<StudentDTO> toModel (Student student){
        StudentDTO studentDTO = new StudentDTO(
                student.getIdStudent(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                student.getTelefono()
        );
        EntityModel<StudentDTO> studentResource = EntityModel.of(studentDTO);
        Link selfLink = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(StudentController.class).getClass()
        ).slash(student.getIdStudent()).withSelfRel();

        Link updateLink = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(StudentController.class).getClass()
        ).slash(student.getIdStudent()).withRel("update");

        Link deleteLink = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(StudentController.class).getClass()
        ).slash(student.getIdStudent()).withRel("delete");

        studentResource.add(selfLink, updateLink, deleteLink);

        return studentResource;
    }
}
