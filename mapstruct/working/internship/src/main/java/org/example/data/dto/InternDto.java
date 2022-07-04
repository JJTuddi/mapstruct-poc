package org.example.data.dto;

import lombok.*;
import org.example.data.entity.PaymentDetailsEntity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InternDto extends EmployeeDto {

    private String internshipNotebook;
    private Integer workingHours;
    private MyLocalDateDto myLocalDateDto;

    @Builder
    public InternDto(Long id, String birthDate, String firstName, String lastName, String username,
                        String password, String internshipNotebook, Integer workingHours) {
        super(id, birthDate, firstName, lastName, username, password);
        this.internshipNotebook = internshipNotebook;
        this.workingHours = workingHours;
    }

}
