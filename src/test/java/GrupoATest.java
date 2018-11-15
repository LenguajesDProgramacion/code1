import org.junit.Test;

import static org.junit.Assert.*;

public class GrupoATest {
    @Test
    public void cliente(){
        GrupoA ga1 = new GrupoA("Luis","A1","15000",150000);
        System.out.print(ga1.descuento());
    }
}