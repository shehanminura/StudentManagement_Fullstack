package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Student;
import edu.icet.ecom.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
@CrossOrigin

public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/getAll")
    public List<Student> getAll(){

        return null;
    }

    @GetMapping("/version")
    public String getVersion(){
        return service.getVersion();
    }

}
