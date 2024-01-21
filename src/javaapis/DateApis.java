package javaapis;

import java.time.*;
import java.time.temporal.ChronoUnit;

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
        Period monthly = Period.ofMonths(2);
        System.out.println(monthly);
        Period yearly = Period.ofYears(3);
        System.out.println(yearly);
        System.out.println(dateBorn.plus(monthly));;

        /***
         * Working with Duration
         * Used to store Time  that is days, hours, minuets,
         * */
        var one = LocalTime.of(5, 15);
        var two = LocalTime.of(6, 30);
        var date = LocalDate.of(2016, 1, 20);
        System.out.println(ChronoUnit.HOURS.between(one, two));
        System.out.println(ChronoUnit.MINUTES.between(one, two));// NB order matters (.between(x,y))  (y-x)
       // System.out.println(ChronoUnit.MINUTES.between(one, date));
    }
}
