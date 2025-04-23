package com.studentsdetails.studentdetails.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentsdetails.studentdetails.dto.CollageListResponse;
import com.studentsdetails.studentdetails.dto.CollageResponse;
import com.studentsdetails.studentdetails.entity.Collage;
import com.studentsdetails.studentdetails.service.CollageService;



@RestController
@RequestMapping("/api/collage")
public class CollageController {

    private final CollageService collageService;
    public CollageController(CollageService collageService) {
        this.collageService = collageService;
    }
    
    @PostMapping("/add")
    public CollageResponse saveCollage(@RequestBody Collage collage) {
        Collage savedCollage = collageService.saveCollage(collage);
        return new CollageResponse("Collage saved successfully", savedCollage);
    }
    
    @GetMapping("/getcollages")
    public ResponseEntity<CollageListResponse> getCollages() {
        List<Collage> collages = collageService.getCollages();
        return ResponseEntity.ok(new CollageListResponse("All collages fetched successfully", collages));
    }


    @GetMapping("/getcollages/{id}")
    public CollageResponse getStudents(@PathVariable String id) {
        Collage collages = collageService.getCollage(id);


        if(collages != null) {
            return new CollageResponse("Collage found successfully",collages);
        } else {
            return new CollageResponse("Collage not found : " + id , null);
    }
}

    @PutMapping("/update/{id}")
    public CollageResponse updateCollage(@PathVariable String id, @RequestBody Collage collage) {
        Collage updatedCollage = collageService.updateCollage(id, collage);
        return new CollageResponse("Collage updated successfully", updatedCollage);
    }

    @DeleteMapping("/delete/{id}")  
    public CollageResponse deleteCollage(@PathVariable String id) {
        collageService.deleteCollage(id);
        return new CollageResponse("Collage deleted successfully", null);
    }


}
