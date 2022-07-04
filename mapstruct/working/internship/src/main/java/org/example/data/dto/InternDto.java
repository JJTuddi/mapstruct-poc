package org.example.data.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class InternDto extends EmployeeDto {

    private String internshipNotebook;
    private Integer workingHours;
    private MyLocalDateDto lastDay;

}
