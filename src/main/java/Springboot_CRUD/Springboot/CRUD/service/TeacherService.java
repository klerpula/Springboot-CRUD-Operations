package Springboot_CRUD.Springboot.CRUD.service;

import Springboot_CRUD.Springboot.CRUD.entity.Teacher;
import Springboot_CRUD.Springboot.CRUD.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getTeacher() {
        return teacherRepository.findAll();
    }

    public List<Teacher> findTeacherById(Long id) {
        return teacherRepository.findTeacherById(id);
    }

    public List<Teacher> deleteTeacherById(Long id) {
        return teacherRepository.deleteTeacherById(id);
    }
}
