package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String abc = scan.next();
//        ZoneOffset



//
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
//        System.out.println((duration.getSeconds())/3600.00 + " hours");
//
//
//
//





        String londonTimeDate = "2020-02-28T23:55:00+00:00[Europe/London]";
        ZonedDateTime london = ZonedDateTime.parse(londonTimeDate);
        String sydneyTimeDate = "2020-03-01T12:03:00+11:00[Australia/Sydney]";
        ZonedDateTime sydney = ZonedDateTime.parse(sydneyTimeDate);

        System.out.println(london);
        System.out.println(sydney);

        Duration duration;
        duration = Duration.between(london,sydney);
        System.out.println(duration + " hours");



        System.out.println();



        String london1TimeDate = "2019-02-28T20:33:00+00:00[Europe/London]";
        ZonedDateTime london1 = ZonedDateTime.parse(londonTimeDate);
        String sydney1TimeDate = "2019-03-02T07:19:00+11:00[Australia/Sydney]";
        ZonedDateTime sydney1 = ZonedDateTime.parse(sydneyTimeDate);

        System.out.println(london1);
        System.out.println(sydney1);

        Duration duration1;
        duration1 = Duration.between(london1,sydney1);

        System.out.println(duration1 + " hours");

    }
}
