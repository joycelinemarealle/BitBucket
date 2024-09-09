package project2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LocalDate start1 = LocalDate.parse("2024-08-01");
        LocalDate end1 = LocalDate.parse("2024-08-05");
        DateRange dr1 = new DateRange(start1, end1);

        LocalDate start2 = LocalDate.parse("2024-08-02");
        LocalDate end2 = LocalDate.parse("2024-08-04");
        DateRange dr2 = new DateRange(start2, end2);

        if(dr1.overlap(dr2)) {
            System.out.println("dr1.overlap(dr2) true");
        }

        if(dr2.overlap(dr1)) {
            System.out.println("dr2.overlap(dr1) true");
        }

        long days = start1.until(end1, ChronoUnit.DAYS) +1;
        System.out.println("Number of days is :" + days);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the date for service? ( yyyy-mm-dd )");
        String checkInDateString = sc.nextLine();
        System.out.println(checkInDateString);
        LocalDate checkInDate = LocalDate.parse(checkInDateString);
        System.out.println(checkInDate);

    }
}

