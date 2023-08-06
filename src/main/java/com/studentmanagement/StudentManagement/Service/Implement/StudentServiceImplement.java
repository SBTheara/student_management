package com.studentmanagement.StudentManagement.Service.Implement;
import com.studentmanagement.StudentManagement.Entity.Student;
import com.studentmanagement.StudentManagement.Repository.StudentRepository;
import com.studentmanagement.StudentManagement.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class StudentServiceImplement implements StudentService {
    private StudentRepository studentRepository;
    public StudentServiceImplement(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> getallStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentID(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deletebyid(Long id) {
        studentRepository.deleteAllById(Collections.singleton(id));
    }

}
