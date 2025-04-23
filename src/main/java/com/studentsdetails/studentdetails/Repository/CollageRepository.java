package com.studentsdetails.studentdetails.Repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.studentsdetails.studentdetails.entity.Collage;


public interface CollageRepository extends MongoRepository<Collage, String> {

    


}
