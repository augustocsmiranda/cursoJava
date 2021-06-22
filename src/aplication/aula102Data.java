package aplication;

import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class aula102Data {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("22/06/2021 10:15:07");

        System.out.println("y1: " + sdf1.format(y1));
        System.out.println("y2: "  + sdf2.format(y2));
        
        //com data atual
        Date x1 = new Date();

        System.out.println("x1: "+ sdf2.format(x1));

        //outra forma de data atual
        Date x2 = new Date(System.currentTimeMillis());
        System.out.println("X2: " + sdf2.format(x2));

        //Formato ISO 8601
        Date x3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("sdf3: " + sdf3.format(x3));
        
    }
}
