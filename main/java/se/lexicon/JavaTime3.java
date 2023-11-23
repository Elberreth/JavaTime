package se.lexicon;


import java.time.LocalDate;
import java.time.Month;
public class JavaTime3 {




        public static void main(String[] args) {
           
            LocalDate currentDate = LocalDate.now();


            LocalDate futureDate = currentDate.plusYears(10).minusMonths(10);


            Month month = futureDate.getMonth();
            System.out.println("Month: " + month);
            System.out.println("This day 10 years from now - 10 months");
        }
    }

