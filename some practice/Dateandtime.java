import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dateandtime {

    public static void main(String[] args) {


        LocalDate date = LocalDate.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String d = date.format(dtf);
        LocalDate ld=LocalDate.parse(d,dtf);
     System.out.println(ld);

//        String dob="05/02/1985";
//        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate ld=LocalDate.parse(dob,dtf);
//        System.out.println(ld);
//        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
//      LocalDate ld=LocalDate.parse(dob,dtf);
//      System.out.println(ld);


    }

}
