package com.studentmanagement.StudentManagement.Service;

import com.studentmanagement.StudentManagement.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getallStudent();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentID(Long id);
    void deletebyid(Long id);
}
