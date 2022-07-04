package org.example.data.dto;

import lombok.*;
import org.example.data.entity.PaymentDetailsEntity;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private Long id;
    private String birthDate;
    private String firstName;
    private String lastName;
    private String username;

}
