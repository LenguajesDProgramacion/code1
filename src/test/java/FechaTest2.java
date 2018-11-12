import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class FechaTest2 {
    @Test
    public void fecha(){
        Calendar calendar = Calendar.getInstance();
        Fecha date1 = new Fecha(calendar.getTime().toString()); //Fecha Actual
        System.out.println (date1.sumarRestarDiasFecha(calendar.getTime(),1));
    }
}