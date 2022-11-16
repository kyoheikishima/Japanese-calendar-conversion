import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

import com.example.japanese_calendar.JapaneseCalendarApplication;

public class Conversion {

    public static String japaneseCalendar(Integer year, Integer month, Integer day) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("Gyy年M月d日");

        JapaneseDate japaneseDate = JapaneseDate.of(year, month, day);

        System.out.println(japaneseDate.format(dateTimeFormatter));

        return null;
    }
}
