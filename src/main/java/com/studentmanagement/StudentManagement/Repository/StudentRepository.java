package com.studentmanagement.StudentManagement.Repository;

import com.studentmanagement.StudentManagement.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
