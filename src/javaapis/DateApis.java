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

        /****
         * Working with Instant
         * Used to hold Zoned time moment
         */
        var date2 = LocalDate.of(2022, 5, 25);
        var time = LocalTime.of(11, 55, 00);
        var zone = ZoneId.of("US/Eastern");
        var zonedDateTime = ZonedDateTime.of(date2, time, zone);
        var instant = zonedDateTime.toInstant(); // 2022–05–25T15:55:00Z
        System.out.println(zonedDateTime); // 2022–05–25T11:55–04:00[US/Eastern]
        System.out.println(instant); // 202–05–25T15:55:00Z
        var testingLocDT = LocalDateTime.of(date2,time);
        System.out.println(testingLocDT);

        /**
         * Trying DayLight Saving Time
         * ***/
        System.out.println("Trying DayLight Saving Time");
        var date3 = LocalDate.of(2022, Month.MARCH, 6);
        var time4 = LocalTime.of(1, 30);
        var zone4 = ZoneId.of("US/Eastern");
        var dateTime = ZonedDateTime.of(date3, time4, zone4);
        System.out.println(dateTime); // 2022-11-06T01:30-04:00[US/Eastern]
        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2022-11-06T01:30-05:00[US/Eastern]
        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2022-11-06T02:3
    }
}
