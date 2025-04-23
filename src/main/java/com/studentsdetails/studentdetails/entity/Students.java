package com.studentsdetails.studentdetails.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Students")
public class Students{

    @Id
    private String id;

    private String studentName;
    private String studentEmail;
    private String studentPhone;
    private String studentAddress;
    private String gender;
    private String departmentName;
    private String collageName;

}
