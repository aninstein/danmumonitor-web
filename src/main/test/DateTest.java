import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017/9/21.
 */
public class DateTest {

    @Test
    public void testtime(){

        Date date=new Date();
        date.setHours(0);
        date.setMinutes(0);
        date.setSeconds(0);

        Date date1=new Date();

        Calendar calendar=Calendar.getInstance();

        System.out.println("hour:"+(date1.getTime()-date.getTime())/(60*60*1000));
        System.out.println("min:"+(date1.getTime()-date.getTime())/(60*1000));


    }

}
