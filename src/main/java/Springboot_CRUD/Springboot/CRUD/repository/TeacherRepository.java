package Springboot_CRUD.Springboot.CRUD.repository;

import Springboot_CRUD.Springboot.CRUD.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    List<Teacher> findTeacherById(Long id);

    List<Teacher> deleteTeacherById(Long id);
}