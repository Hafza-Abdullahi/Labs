package Lab3;
import java.util.Calendar;

public class clock {
    public static void main(String args[]) {
        Long msElapsed;
        Long OneSecond;
        Calendar cal = Calendar.getInstance();
        Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
    
        
        msElapsed = System.currentTimeMillis();
        OneSecond = System.currentTimeMillis() + 1000;

        System.out.println(msElapsed + " AND " + OneSecond);
        
        }

}
