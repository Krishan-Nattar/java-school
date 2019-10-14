package com.lambdaschool.school.repository;

import com.lambdaschool.school.model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long>
{
    List<Student> findByStudnameContainingIgnoreCase(String name);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO studcourses (studid, courseid) VALUES (:studid, :courseid)", nativeQuery = true)
    void insertStudentIntoCourse(long studid, long courseid);

}
