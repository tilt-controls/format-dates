package com.pluralsight;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class TimeApp {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("hh:mm");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        ZonedDateTime gmtDateTime = ZonedDateTime.now(ZoneOffset.UTC);




        System.out.println(localDate); // date with dashes
        System.out.println(localDate.format(fmt)); // date with slashes
        System.out.println(LocalDateTime.now().format(fmt2));// date with hours and seconds
        System.out.println(gmtDateTime.format(fmt2)); // formatted from ^ to gmt time zone
        System.out.printf("%s on %s", // display in local time zone
                localDateTime.format(fmt3), localDateTime.format(fmt4));

    }
}
