package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now().plusWeeks(2));

        LocalDate date = LocalDate.of(2026, 1, 1);
        int result = LocalDate.now().compareTo(date);
        if (result == 0) {
            System.out.println("Same");
        } else if (result > 0) {
            System.out.println("Later");
        } else {
            System.out.println("Earlier");
        }

        LocalDate start = LocalDate.of(2024, 1, 1);
        LocalDate end = LocalDate.of(2024, 12, 31);
        System.out.println(ChronoUnit.DAYS.between(start, end));
    }
}