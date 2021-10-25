package io.github.polamreddyvivekreddy.hellojavaworld;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);

        LocalDateTime futureDateTime = localDateTime.plusDays(100);
//        System.out.println(futureDateTime);

        LocalDateTime randomDate = LocalDateTime.of(1999,2,18,10,10);
//        System.out.println(randomDate);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        ZonedDateTime foreignZonedDateTime = ZonedDateTime.of(randomDate, zoneId );
        System.out.println(foreignZonedDateTime);
    }
}
