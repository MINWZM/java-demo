package commonClass;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

    @Test
    public void testDate(){
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String today = sdf.format(d);
        System.out.println(today);
    }

    @Test
    public void testParse(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String day="2018-7-30 12:00:00";

        try {
            Date date=sdf.parse(day);
            System.out.println("时间:" + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testDateAndParse() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String today = sdf.format(date);
        System.out.println("日期转格式:"+today);
        Date d = sdf.parse(today);
        System.out.println("格式转日期:"+d);
    }

    @Test
    public void testCalendar(){
        Calendar c = Calendar.getInstance();
        System.out.println("日历"+c);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hours = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        System.out.println("时间:"+year+"-"+month+"-"+day+" "+hours+":"+minute+":"+second);
    }

    @Test
    public void testCalendarAndDate(){
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("时间:"+sdf.format(date));
    }
}
