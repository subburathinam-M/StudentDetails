package com.studentsdetails.studentdetails.dto;

import java.util.List;

import com.studentsdetails.studentdetails.entity.Students;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentListResponse {

    private String message;
    private List<Students> data;


}
