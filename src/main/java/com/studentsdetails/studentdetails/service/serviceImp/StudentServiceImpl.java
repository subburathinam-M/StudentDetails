package com.studentsdetails.studentdetails.service.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentsdetails.studentdetails.Repository.StudentRepository;
import com.studentsdetails.studentdetails.entity.Students;
import com.studentsdetails.studentdetails.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{



    private final StudentRepository studentRepository;

    public StudentServiceImpl( StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    @Override
    public Students saveStudents(Students students) {
        return studentRepository.save(students);
    }

    public Students getStudents(String id) {
        return studentRepository.findById(id)
                            .orElseThrow(() ->  new RuntimeException("Student not found"));
    }

    public List<Students> getStudents() {
        return studentRepository.findAll();
    }

    public Students updateStudents(String id, Students students) {

        Students existingStudent  = studentRepository.findById(id).orElse(null);

        if (existingStudent != null) {
            existingStudent.setStudentName(students.getStudentName());
            existingStudent.setStudentEmail(students.getStudentEmail());
            existingStudent.setStudentPhone(students.getStudentPhone());
            existingStudent.setStudentAddress(students.getStudentAddress());

            return studentRepository.save(existingStudent); 
        }


        throw new RuntimeException("Student not found with id: " + id);


         // return studentRepository.findById(id)
        //                     .map(student -> {
        //                         student.setStudentName(students.getStudentName());
        //                         student.setStudentEmail(students.getStudentEmail());
        //                         student.setStudentPhone(students.getStudentPhone());
        //                         student.setStudentAddress(students.getStudentAddress());
        //                         return studentRepository.save(student);
        //                     })
        //                     .orElseThrow(() -> new RuntimeException("Student not found"));

    }

    public void deleteStudents(String id) {
        studentRepository.deleteById(id);
    }

    



}
