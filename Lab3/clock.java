// Student Name 	: Hafza Abdullahi
// Student Id Number: C00286249
// Date 			: Sept 2023
// Purpose 			: Savings account
package Lab3;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class clock {
    public static void main(String args[]) throws InterruptedException {
        Long current;
        Long oneMinute;
        Calendar cal = Calendar.getInstance();
        Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
    
        
        current = System.currentTimeMillis();
        oneMinute = current + 60000; //60secs later 
        
        while( System.currentTimeMillis() < oneMinute) {  //system.currrentTimeMillis() used so it updates
            
            t.tick();
            System.out.println(t);
            TimeUnit.SECONDS.sleep(1);      //wait one second, throws interruptedException
            
        }
        

        }
        

}
