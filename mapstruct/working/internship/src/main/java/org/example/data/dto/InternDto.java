package org.example.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
