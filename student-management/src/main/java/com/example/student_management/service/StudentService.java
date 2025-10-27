package com.example.student_management.service;

import com.example.student_management.entity.Student;
import com.example.student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;


@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public long countStudents() {
        return studentRepository.count();
    }

    public Collection<Object[]> countByYear() {
        return studentRepository.findNbrStudentByYear();
    }
    public Student save(Student student) {
         return studentRepository.save(student);
    }
    public boolean delete(long id) {
        if (studentRepository.existsById((int) id)) {
            studentRepository.deleteById((int) id);
            return true;
        }
        return false;
    }
    public Collection<?> findNbrStudentByYear() {
        return studentRepository.findNbrStudentByYear();
    }
}
