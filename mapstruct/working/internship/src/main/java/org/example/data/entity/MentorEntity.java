package org.example.data.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class MentorEntity extends EmployeeEntity {

    private InternEntity intern;

    @Builder
    public MentorEntity(Long id, String birthDate, String firstName, String lastName, String username,
                        String password, PaymentDetailsEntity paymentDetails, InternEntity intern) {
        super(id, birthDate, firstName, lastName, username, password, paymentDetails);
        this.intern = intern;
    }

}
