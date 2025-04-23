package com.studentsdetails.studentdetails.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Collage")
public class Collage {
    
    private String id;
    private String collageName;
    private List<Department> departments;

}
