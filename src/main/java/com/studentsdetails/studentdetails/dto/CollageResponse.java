package com.studentsdetails.studentdetails.dto;

import com.studentsdetails.studentdetails.entity.Collage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollageResponse {
   private String message;
   private Collage data;
}
