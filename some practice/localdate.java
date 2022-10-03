import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class localdate {
    public static void main(String args[]){
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime current = LocalDateTime.now().plusDays(1);
        //System.out.println("current date and time in default format: "+ current);
        String udf= current.format(formatObj);
       System.out.println("current date and time in userdefined format: "+ udf);
    }
}
