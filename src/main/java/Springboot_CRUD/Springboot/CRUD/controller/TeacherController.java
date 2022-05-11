package Springboot_CRUD.Springboot.CRUD.controller;

import Springboot_CRUD.Springboot.CRUD.entity.Teacher;
import Springboot_CRUD.Springboot.CRUD.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/teacher")
@Slf4j
@Transactional
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/getTeacher")
    public List<Teacher> getTeacher() {
        return teacherService.getTeacher();
    }

    @GetMapping("/find/{id}")
    public List<Teacher> findTeacherById(@PathVariable("id") Long id) {
        return teacherService.findTeacherById(id);
    }


    @PostMapping("/addTeacher")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);

    }
    @DeleteMapping("/delete/{id}")
    public List<Teacher> deleteTeacherById(@PathVariable("id") Long id){
        return teacherService.deleteTeacherById(id);
    }

}
