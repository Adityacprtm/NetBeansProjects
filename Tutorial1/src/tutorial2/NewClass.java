package tutorial2;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class NewClass {

    public static void main(String[] args) {
        String dd_MM_yyyy = "28-02-2013";
        String[] splits = dd_MM_yyyy.split("-");
        int dd = Integer.parseInt(splits[0]);
        int mm = Integer.parseInt(splits[1]);
        int yy = Integer.parseInt(splits[2]);
//        System.out.println(dd + "-" + mm + "-" + yy);
        Calendar cal = Calendar.getInstance();
        cal.set(yy, mm-1, dd);
        Date thedate = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(sdf.format(thedate));
        
    }
}
