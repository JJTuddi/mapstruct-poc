package org.example.data.entity;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetailsEntity {

    private String salary;
    private String iban;
    private Float bonus;

}
