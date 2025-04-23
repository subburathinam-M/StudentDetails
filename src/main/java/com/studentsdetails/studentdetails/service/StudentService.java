package com.studentsdetails.studentdetails.service;

import java.util.List;

import com.studentsdetails.studentdetails.entity.Students;

public interface StudentService {
    
    Students saveStudents(Students students);

    Students getStudents(String id);

    List<Students> getStudents();

    Students updateStudents(String id, Students students);

    void deleteStudents(String id);


    

}
