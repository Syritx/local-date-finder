import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class Main {

    static String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minutes = cal.get(Calendar.MINUTE);
        String dayIndicator = "AM";

        if (hour >= 12) dayIndicator = "PM";
        if (hour > 12) hour = hour-12;

        String minutesFormat = Integer.toString(minutes);
        if (minutes < 10) minutesFormat = "0"+minutes;

        String dateFormat = months[month] + " / " + day + " / " + year + " at " + hour + ":" + minutesFormat + " " + dayIndicator;
        System.out.println("your time is: "+dateFormat);
    }
}