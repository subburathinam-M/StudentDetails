package com.studentsdetails.studentdetails.dto;

import com.studentsdetails.studentdetails.entity.Students;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

   private String message;
   private Students data;


}
