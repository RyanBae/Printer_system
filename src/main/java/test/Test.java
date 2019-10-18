package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:dd:ss");
            Calendar time = Calendar.getInstance();

            String start = dateFormat.format(time.getTime());
            String end = "2020-01-15 15:19:23";

            String[] splitStart = start.split(" ");
            String[] splitEnd = end.split(" ");
            String sStart = splitStart[0].replace("-","");
            String sEnd = splitEnd[0].replace("-","");

            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Calendar beginDate = Calendar.getInstance();
            beginDate.setTime(format.parse(sStart));
            Calendar endDate = Calendar.getInstance();
            endDate.setTime(format.parse(sEnd));

            int month1 = beginDate.get(Calendar.YEAR) * 12 + beginDate.get(Calendar.MONTH);
            int month2 = endDate.get(Calendar.YEAR) * 12 + endDate.get(Calendar.MONTH);
            System.out.println(beginDate);
            System.out.println(endDate);
            Integer result = month2 - month1;

            System.out.println(result);

        }catch (ParseException e){
            e.printStackTrace();
        }




    }


}
