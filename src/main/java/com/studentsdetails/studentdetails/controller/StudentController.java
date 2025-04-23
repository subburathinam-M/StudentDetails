package com.studentsdetails.studentdetails.controller;

import org.springframework.web.bind.annotation.RestController;

import com.studentsdetails.studentdetails.dto.StudentListResponse;
import com.studentsdetails.studentdetails.dto.StudentResponse;
import com.studentsdetails.studentdetails.entity.Students;
import com.studentsdetails.studentdetails.service.StudentService;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/api/student")

public class StudentController {

    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public StudentResponse saveStudents(@RequestBody Students students) {
        Students student = studentService.saveStudents(students);
        return new StudentResponse("Student saved successfully",student);
    }


    @GetMapping("/getstudents/{id}")
    public StudentResponse getStudents(@PathVariable String id) {
        Students student = studentService.getStudents(id);


        if(student != null) {
            return new StudentResponse("Student found successfully",student);
        } else {
            return new StudentResponse("Student not found : " + id , null);
        }
    }


    @GetMapping("/getstudents")
    public ResponseEntity<StudentListResponse> getStudents() {

        List<Students> students = studentService.getStudents();

        return ResponseEntity.ok(new StudentListResponse("All students fetched successfully", students));

        
    }

    @PutMapping("/updateStudent/{id}")
    public String updateStudents(@PathVariable String id, @RequestBody Students students) {

        Students existingStudent = studentService.updateStudents(id, students);

        if(existingStudent != null) {
            return "Student updated successfully";
        } else {
            return "Student not found with id: " + id;
        }
    }


    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudents(@PathVariable String id) {
        studentService.deleteStudents(id);
        return "Student deleted successfully";
    }

    
    
    

}
