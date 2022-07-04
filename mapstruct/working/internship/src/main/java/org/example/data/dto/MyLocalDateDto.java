package org.example.data.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@NoArgsConstructor
public class MyLocalDateDto {

    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);

    private Integer year;
    private Integer month;
    private Integer day;

    public MyLocalDateDto(String date) {
        LocalDate localDate = LocalDate.parse(date, DATE_FORMATTER);
        year = localDate.getYear();
        month = localDate.getMonthValue();
        day = localDate.getDayOfMonth();
    }

    @Override
    public String toString() {
        return LocalDate.of(year, month, day).format(DATE_FORMATTER);
    }

}
