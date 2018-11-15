import org.junit.Test;

import static org.junit.Assert.*;

public class MasajistaTest {
    @Test
    public void masajista(){
        Masajista m1 = new Masajista("1","Edgar","Perez", 48,"Experto",5);
        m1.entranamiento();
        System.out.print(m1.darMasaje()+"\n");
        m1.partidoFutbol();
    }
}