package se.lexicon;


import java.time.LocalDate;
import java.time.Month;
public class JavaTime3 {



    public class DateExample {
        public static void main(String[] args) {
            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // Add 10 years and subtract 10 months
            LocalDate futureDate = currentDate.plusYears(10).minusMonths(10);

            // Extract and print the month
            Month month = futureDate.getMonth();
            System.out.println("Month: " + month);
        }
    }
}
