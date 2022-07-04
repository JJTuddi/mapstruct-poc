package org.example.data.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.example.data.entity.PaymentDetailsEntity;

import java.time.LocalDate;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private Long id;
    private String birthDate;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

}
