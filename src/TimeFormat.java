import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {

    public static void main(String[] args) throws ParseException {

        String s = "07:05:45PM";
        String timeConversion = timeConversion(s);
        System.out.println(timeConversion);

       String result =  timeConversionUsingDateFormat(s);
        System.out.println(result);
    }

    public static String timeConversion(String s){
        int hour = Integer.parseInt(s.substring(0, 2)) % 12;
        if (s.endsWith("PM"))
            hour += 12;
        return String.format("%02d", hour) + s.substring(2, 8);

    }

    public static String timeConversionUsingDateFormat(String s) throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat dateFormatTo = new SimpleDateFormat("HH:mm:ss");
        String result = "";
        Date time = dateFormat.parse(s);
        result = dateFormatTo.format(time);
        return result;

    }
}
