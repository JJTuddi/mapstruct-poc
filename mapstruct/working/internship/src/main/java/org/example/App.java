package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.data.entity.InternEntity;
import org.example.data.entity.PaymentDetailsEntity;
import org.mapstruct.ap.internal.model.Mapper;
import org.mapstruct.factory.Mappers;

public class App {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {
        PaymentDetailsEntity paymentDetails = PaymentDetailsEntity.builder()
                .iban("43282894237947329482378423")
                .bonus(20.5f)
                .salary("Fara numar!")
                .build();
        InternEntity intern = InternEntity.builder()
                .id(5L)
                .birthDate("29-08-2000")
                .firstName("Tudorel Alexandru")
                .lastName("Blidea")
                .username("tuddi")
                .password("myPass")
                .workingHours(40)
                .internshipNotebook("A lot to do")
                .paymentDetails(paymentDetails)
                .build();
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(intern));
    }
}
