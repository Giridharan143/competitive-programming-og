import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class date_practice{
    public static void timeCalculation(){
        long start;
        long end;
        start = System.currentTimeMillis();
        System.out.println("Start: "+start);
        StringBuffer str1 = new StringBuffer();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            str2.append("s");
        }
        end = System.currentTimeMillis();
        System.out.println("End: "+end);
        System.out.println("The Time taken for the operation is : "+Math.abs(start-end));
    }
    
    public static void learningDateClass(){
        // LocalDate today = LocalDate.now();
        LocalDate today = LocalDate.now();
        System.out.println(today);
        Month month=today.getMonth();
        String monthi = String.valueOf(month);
        System.out.println("Month : "+monthi.toLowerCase());
        // DtaeFormatter formatt = DateFormatter.ofPattern("dd/yyyy/MM");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatti = today.format(format);
        System.out.println(formatti);
    }

    public static void main(String[] args) {
        // timeCalculation();
        learningDateClass();
    }
}