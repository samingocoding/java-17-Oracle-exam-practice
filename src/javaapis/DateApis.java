package javaapis;

import java.time.*;

public class DateApis {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        /***
         * Working with periods*
         * to obtain amount of time in years months and days
         */
        Period weekly = Period.ofWeeks(3);
        LocalDate dateBorn = LocalDate.of(1999,6,24);
        System.out.println(weekly);
    }
}
