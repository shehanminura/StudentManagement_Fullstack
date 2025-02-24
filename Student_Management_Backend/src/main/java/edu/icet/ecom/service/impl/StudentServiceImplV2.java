package edu.icet.ecom.service.impl;

import edu.icet.ecom.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplV2 implements StudentService {

    @Override
    public String getVersion() {
        return "2.0.0 V";
    }
}
