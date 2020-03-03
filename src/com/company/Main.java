package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm",
            Locale.ENGLISH);




    public static void main(String[] args) {
//        for(var z : ZoneId.getAvailableZoneIds()){
//            System.out.println(z);
//        }

        printFlightInfo(
                "28-Feb-2020 23:55", "Europe/London",
                "01-Mar-2020 12:03", "Australia/Sydney"
        );


//        String londonTimeDate = "2020-02-28T23:55:00+00:00[Europe/London]";
//        ZonedDateTime london = ZonedDateTime.parse(londonTimeDate);
//        String sydneyTimeDate = "2020-03-01T12:03:00+11:00[Australia/Sydney]";
//        ZonedDateTime sydney = ZonedDateTime.parse(sydneyTimeDate);
//
//        System.out.println(london);
//        System.out.println(sydney);
//
//        Duration duration;
//        duration = Duration.between(london,sydney);
//        System.out.println(duration + " hours");
//
//
//
//        System.out.println();
//
//
//
//        String london1TimeDate = "2019-02-28T20:33:00+00:00[Europe/London]";
//        ZonedDateTime london1 = ZonedDateTime.parse(london1TimeDate);
//        String sydney1TimeDate = "2019-03-02T07:19:00+11:00[Australia/Sydney]";
//        ZonedDateTime sydney1 = ZonedDateTime.parse(sydney1TimeDate);
//
//        System.out.println(london1);
//        System.out.println(sydney1);
//
//        Duration duration1;
//        duration1 = Duration.between(london1,sydney1);
//
//        System.out.println(duration1 + " hours");

    }


    private static void printFlightInfo(String depTime, String depZone,
                                        String arrTime, String arrZone) {
        var depZonedTime = createZonedDateTime(depTime, depZone);
        var arrZonedTime = createZonedDateTime(arrTime, arrZone);
        Duration dur = Duration.between(depZonedTime, arrZonedTime);
//        Math()
        System.out.print((dur.getSeconds())/3600 + " " + dur.getSeconds()/3600.00);
    }

    private static ZonedDateTime createZonedDateTime(String strTime, String strZone) {
        LocalDateTime dt = LocalDateTime.parse(strTime, format);
        ZoneId z = ZoneId.of(strZone);

        return ZonedDateTime.of(dt, z);
    }
}
