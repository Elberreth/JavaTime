package se.lexicon;

import javax.print.DocFlavor;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class JavaTime2 {
    public static void main(String[] args) {

        // Your date string
        String dateString = "2023-11-21";

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the string to create a LocalDate object
        LocalDate localDate = LocalDate.parse(dateString, formatter);

        // Print the LocalDate object
        System.out.println("Parsed LocalDate: " + localDate);




        String dateString2 = "1945-08-05";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate2 = LocalDate.parse(dateString2,formatter2);
        System.out.println("parsed localDate: " +localDate2);

    }
}

