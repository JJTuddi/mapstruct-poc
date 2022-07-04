package org.example.data.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InternEntity extends EmployeeEntity {

    private String internshipNotebook;
    private Integer workingHours;
    private String lastDay;

    @Builder
    public InternEntity(Long id, String birthDate, String firstName, String lastName, String username,
                        String password, PaymentDetailsEntity paymentDetails, String internshipNotebook,
                        Integer workingHours, String lastDay) {
        super(id, birthDate, firstName, lastName, username, password, paymentDetails);
        this.internshipNotebook = internshipNotebook;
        this.workingHours = workingHours;
        this.lastDay = lastDay;
    }

}
