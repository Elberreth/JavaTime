package se.lexicon;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class JavaTime3 {
//public class TimeExample {


    public static void main(String[] args) {

        currentTime3();
        nanoSeconds();
        timeString();
        currentTime4();
        currentDate2();
        currentDate3();












        //cant understand Ex8 at the moment so ex9

    }
public static void currentDate2(){
    System.out.println("Task 7");

        LocalDate currentDate = LocalDate.of(1974, 3, 26);
        LocalDate currentDate2 = currentDate.now();
    Period period = Period.between(currentDate, currentDate2);


    int elapsedYears = period.getYears();
    int elapsedMonths = period.getMonths();
    int elapsedDays = period.getDays();

    System.out.println("Since my birthday:");
    System.out.println("Elapsed Years: " + elapsedYears);
    System.out.println("Elapsed Months: " + elapsedMonths);
    System.out.println("Elapsed Days: " + elapsedDays);
    System.out.println("");
    }

public static void currentTime3() {
    LocalTime currentTime3 = LocalTime.now();
    System.out.println("***********");
    System.out.println("Task 9  ");
    System.out.println("");
    System.out.println("Time now");
    System.out.println(currentTime3.format(DateTimeFormatter.ofPattern("H:mm")));
    System.out.println("");
}


static void nanoSeconds(){
    System.out.println("task 10");
    System.out.println("");
    System.out.println("NanoSeconds");
        LocalTime nanoSeconds = LocalTime.now();


    System.out.println( nanoSeconds.format(DateTimeFormatter.ofPattern("n")));
    System.out.println("");
    }

    static void timeString() {
        System.out.println("Task 11");
        System.out.println("");
        String timeString = "15:30:45";


        // Create a DateTimeFormatter to parse the String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Parse the String and create a LocalTime object
        LocalTime parsedTime = LocalTime.parse(timeString, formatter);

        // Print the parsed LocalTime
        System.out.println("Parsed Time: " + parsedTime);
    }
        public static void currentTime4() {
            System.out.println("");
            System.out.println("Task 12 Current time");
            System.out.println("");
            LocalTime currentTime4 = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            System.out.println(currentTime4.format(DateTimeFormatter.ofPattern("H:mm")));
            System.out.println("");

        }
    public static void currentDate3(){
                System.out.println("Task 6");
                System.out.println("");



                LocalDate currentDate3 = LocalDate.now();


                LocalDate futureDate = currentDate3.plusYears(10).minusMonths(10);


                Month month = futureDate.getMonth();
                System.out.println("Month: " + month);
                System.out.println("This month 10 years from now - 10 months");
                System.out.println("");
            }
    }


