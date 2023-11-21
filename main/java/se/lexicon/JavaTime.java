package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class JavaTime {


public static void main(String[] args) {

    LocalDate date = LocalDate.now();

   // System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    System.out.println(date.format(DateTimeFormatter.ISO_WEEK_DATE));
    System.out.println(date.format(DateTimeFormatter.ofPattern("eeee dd MM y")));
    System.out.println(date);


}}
