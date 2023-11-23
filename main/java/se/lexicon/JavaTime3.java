package se.lexicon;


import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
public class JavaTime3 {




        public static void main(String[] args) {

            System.out.println("Task 6");
            System.out.println("*********");


            LocalDate currentDate = LocalDate.now();


            LocalDate futureDate = currentDate.plusYears(10).minusMonths(10);


            Month month = futureDate.getMonth();
            System.out.println("Month: " + month);
            System.out.println("This month 10 years from now - 10 months");
            System.out.println("");
            System.out.println("Task 7 ");
            System.out.println("*************");


            LocalDate currentDate2 = LocalDate.of(1974,3, 26);
           
            Period period = Period.between (currentDate2, currentDate);


            int elapsedYears = period.getYears();
            int elapsedMonths = period.getMonths();
            int elapsedDays = period.getDays();

            System.out.println("Elapsed Years: " + elapsedYears);
            System.out.println("Elapsed Months: " + elapsedMonths);
            System.out.println("Elapsed Days: " + elapsedDays);
        }
    }

