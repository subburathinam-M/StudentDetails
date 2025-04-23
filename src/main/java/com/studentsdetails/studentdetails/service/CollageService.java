package com.studentsdetails.studentdetails.service;

import java.util.List;

import com.studentsdetails.studentdetails.entity.Collage;

public interface CollageService {

    Collage saveCollage(Collage collage);

    Collage getCollage(String id);

    List<Collage> getCollages();

    Collage updateCollage(String id, Collage collage);


    void deleteCollage(String id);



}
