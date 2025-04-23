package com.studentsdetails.studentdetails.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.studentsdetails.studentdetails.entity.Students;

public interface StudentRepository extends MongoRepository<Students, String>{
// List<Students> findByDepartmentName(String departmentName);
// List<Students> findByCollageName(String collageName);
List<Students> findByCollageNameAndDepartmentName(String collageName, String departmentName);


}
