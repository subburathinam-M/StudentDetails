package com.studentsdetails.studentdetails.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private String deptName;

    private List<Students> boys;
    private List<Students> girls;

}
