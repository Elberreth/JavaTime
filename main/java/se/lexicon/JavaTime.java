package se.lexicon;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.time.temporal.TemporalAdjusters;
public class JavaTime {
//public class ParseLocalDate {


    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        System.out.println("Todays date");
        System.out.println("***********");


        System.out.println(date.format(DateTimeFormatter.ofPattern("eeee dd MMMM")));

        System.out.println("");
        System.out.println("Last monday");
        System.out.println("***********");
        LocalDate today = LocalDate.now();
        LocalDate lastMonday = today.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println(lastMonday.format(DateTimeFormatter.ofPattern("eeee dd MMMM")));
        System.out.println("***********");
        System.out.println("This week");
        System.out.println("");
        //boolean weekLoop = true;
        //while (weekLoop);

        // Skapa ett datumobjekt från ett specifikt år, månad och dag

        LocalDate date2 = LocalDate.of(2023, 11, 21);

        // Hämta veckodagen för det datumet

        int dayOfWeek = date2.get(ChronoField.DAY_OF_WEEK);

        // Justera datumet till måndagen i samma vecka

        date2 = date2.minusDays(dayOfWeek - 1);

        // Skapa en array med veckodagarnas namn

        String[] dayofWeek = {"Mån", "Tis", "Ons", "Tor", "Fre", "Lör", "Sön"};

        // Skriv ut veckodagarnas namn och datum

        for (int i = 0; i < 7; i++) {
            System.out.print(dayofWeek[i] + ", ");
            System.out.println(date2);
            // Lägg till en dag till datumet
            date2 = date2.plusDays(1);


        }


    }
}


