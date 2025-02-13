package programs;

import java.io.*;
import java.util.Calendar;
import java.util.Scanner;

public class DateAndTime {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        String dayOfWeek = DateAndTime.findDay(month, day, year);
        System.out.println(dayOfWeek);
    }

    public static String findDay(int month, int day, int year) {
        String[] dayOfWeek = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month - 1,day);
        int dayNum = calendar.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek[dayNum-1];
    }
}
