package edu.icet.ecom.dto;

import edu.icet.ecom.util.GenderType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Student {
    private Integer id;

    private String name;

    private String address;

    private String age;

    private GenderType gender;

}
