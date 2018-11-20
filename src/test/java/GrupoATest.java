import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrupoATest {
 @Test
    public void totalPagar(){
        Cliente c1 = new GrupoA("Daniel",1,10500);
        c1.totalpagar();
        System.out.print(c1.totalpagar());
    }
}