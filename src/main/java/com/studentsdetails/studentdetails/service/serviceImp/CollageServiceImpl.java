package com.studentsdetails.studentdetails.service.serviceImp;

import java.util.List;


import org.springframework.stereotype.Service;

import com.studentsdetails.studentdetails.Repository.CollageRepository;
import com.studentsdetails.studentdetails.Repository.StudentRepository;
import com.studentsdetails.studentdetails.entity.Collage;
import com.studentsdetails.studentdetails.entity.Department;
import com.studentsdetails.studentdetails.entity.Students;
import com.studentsdetails.studentdetails.exception.CollageNotFoundException;
import com.studentsdetails.studentdetails.service.CollageService;

@Service
public class CollageServiceImpl implements CollageService {

    
    private final CollageRepository collageRepository;
    private final StudentRepository studentRepository;

    public CollageServiceImpl(CollageRepository collageRepository , StudentRepository studentRepository) {

        this.collageRepository = collageRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public Collage saveCollage(Collage collage) {
        for (Department dept : collage.getDepartments()) {
            List<Students> students = studentRepository.findByCollageNameAndDepartmentName(
                collage.getCollageName(),
                dept.getDeptName());
            
    
            List<Students> boys = students.stream()
                    .filter(s -> "Male".equalsIgnoreCase(s.getGender()))
                    .toList();
    
            List<Students> girls = students.stream()
                    .filter(s -> "Female".equalsIgnoreCase(s.getGender()))
                    .toList();
    
            dept.setBoys(boys);
            dept.setGirls(girls);
        }
    
        return collageRepository.save(collage);
    }
    

    @Override 
    public Collage getCollage(String id) {
        return collageRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Collage not found"));
    }

    @Override
    public List<Collage> getCollages() {
        return collageRepository.findAll();
    }

    @Override
    public Collage updateCollage(String id, Collage collage) {
            Collage existingCollage = collageRepository.findById(id)
            .orElseThrow(() -> new CollageNotFoundException("Collage with ID " + id + " not found"));

            existingCollage.setCollageName(collage.getCollageName());
            existingCollage.setDepartments(collage.getDepartments());

            return collageRepository.save(existingCollage);

        // return collageRepository.findById(id).map(existingCollage -> {
        //     existingCollage.setCollageName(collage.getCollageName());
        //     existingCollage.setDepartments(collage.getDepartments());
        //     return collageRepository.save(existingCollage);
        // }).orElse(null);
    }

    @Override
    public void deleteCollage(String id) {
        collageRepository.deleteById(id);
    }

}
