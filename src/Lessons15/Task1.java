package Lessons15;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {

        for(int i = 1901; i<=2023; i++){
            for(int j = 1; j<=12; j++){
                if(LocalDate.of(i, j, 13).getDayOfWeek().equals(DayOfWeek.FRIDAY)){
                    System.out.println(LocalDate.of(i, j, 13));
                }
            }
        }
    }
}
