package Lessons15;

import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        LocalDate day = LocalDate.ofYearDay(2021, 256);
        System.out.println(day);

    }
}
