import java.util.*;
import java.text.*;

public class PreviousMonth {
    public static void main(String args[]) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMddyy");
        Calendar startCal = new GregorianCalendar();
        Calendar endCal = new GregorianCalendar();
        startCal.add(Calendar.MONTH, -1);
        int monthArray[] = new int[31];
        
        Date startDate = startCal.getTime();
        Date endDate = endCal.getTime();
        
        System.out.println("STARTING START DATE: " + sdf.format(startDate));
        System.out.println("STARTING END DATE:   " + sdf.format(endDate));
        
        int endDateNum = Integer.parseInt(sdf.format(endDate));
        int i = 0;
        
        while(Integer.parseInt(sdf.format(startDate)) != endDateNum){
            startCal.add(Calendar.DAY_OF_MONTH, 1);
            monthArray[i] = Integer.parseInt(sdf.format(startDate));
            System.out.println("START: " + monthArray[i]);
            //System.out.println("END:   " + sdf.format(endDate));
            startDate = startCal.getTime();
            i++;
        }
        
        System.out.println("ENDING START DATE: " + sdf.format(startDate));
        System.out.println("ENDING END DATE:   " + sdf.format(endDate));
        

    }
}
