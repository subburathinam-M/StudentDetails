package com.studentsdetails.studentdetails.dto;

import java.util.List;

import com.studentsdetails.studentdetails.entity.Collage;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollageListResponse {
 private String message;
    private List<Collage> data;

}
