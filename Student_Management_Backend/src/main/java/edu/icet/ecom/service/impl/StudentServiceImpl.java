package edu.icet.ecom.service.impl;

import edu.icet.ecom.service.StudentService;
import org.springframework.stereotype.Service;

//@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String getVersion() {
        return "1.0.0 V";
    }
}
