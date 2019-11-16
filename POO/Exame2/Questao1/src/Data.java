import java.util.Calendar;

public class Data {
    private Calendar cal;
    public static String hoje(){
        Calendar c = Calendar.getInstance();
        String dt = new String(c.get(Calendar.YEAR) + "-"+c.get(Calendar.MONTH) + "-" + c.get(Calendar.DAY_OF_MONTH));
        return dt;
    }
}
