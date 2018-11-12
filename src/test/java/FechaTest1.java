import org.junit.Test;


import static org.junit.Assert.*;

public class FechaTest1 {
    @Test
    public void fecha(){
        Fecha date1 = new Fecha("22/12/2018");
        boolean res = true;
        res = date1.validarFecha(date1.getFecha());
        if(res == true){
            System.out.println("La fecha es valida");
        }else
            System.out.println("La fecha no es valida");
    }
}