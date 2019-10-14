package com.lambdaschool.school.service;

import com.lambdaschool.school.model.Student;

import java.util.List;

public interface StudentService
{
    List<Student> findAll();

    Student findStudentById(long id);

    List<Student> findStudentByNameLike(String name);

    void delete(long id);

    Student save (Student student);

    Student update(Student student, long id);

    void insertStudentIntoCourse(long studid, long courseid);
}
