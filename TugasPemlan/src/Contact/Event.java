package Contact;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Event {

    public static final int BIRTHDAY_TYPE = 909;
    public static final int CELEBRATION_TYPE = 908;
    public static final int ANNIVERSARY_TYPE = 907;
    private Date date;
    private int type;

    public Event() {
    }

    public void setDate(String dd_MM_yyyy) {
        String[] splits = dd_MM_yyyy.split("-");
        int dd = Integer.parseInt(splits[0]);
        int mm = Integer.parseInt(splits[1]);
        int yy = Integer.parseInt(splits[2]);

        Calendar cal = Calendar.getInstance();
        cal.set(yy, mm - 1, dd);
        this.date = cal.getTime();
    }

    public String getDate() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
        return sdf.format(date);
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }
}
