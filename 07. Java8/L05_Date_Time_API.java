import java.time.*; 

public class L05_Date_Time_API {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        LocalDate d1 = LocalDate.of(1999, 12, 31);
        System.out.println(d1);

        LocalTime t1 = LocalTime.of(12, 45, 30);
        System.out.println(t1);

        LocalDateTime dt1 = LocalDateTime.of(1999, 12, 31, 12, 45, 30);
        System.out.println(dt1);

        int day = d.getDayOfMonth();
        int month = d.getMonthValue();
        int year = d.getYear();
        System.out.println(day + " " + month + " " + year);

        System.out.println("\n%d/%d/%d".formatted(day, month, year));
        System.out.printf("\n%d/%d/%d",day, month, year);
    }
}

// also known as Joda Time API