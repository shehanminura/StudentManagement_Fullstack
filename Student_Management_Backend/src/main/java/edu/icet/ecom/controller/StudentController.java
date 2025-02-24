package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // frountend ekan ena request laba gani
@RequestMapping("/api/student") //method eka run karanna one me parath ekan
@RequiredArgsConstructor
@CrossOrigin
public class StudentController {

    @GetMapping("/getAll")
    public List<Student> getAll(){
        return null;
    }

}
