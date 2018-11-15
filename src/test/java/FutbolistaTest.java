import static org.junit.Assert.*;
import org.junit.Test;

public class FutbolistaTest {
    @Test
    public void futbolista(){
        Futbolista f1 = new Futbolista("1","Luis","Castellon", 21,45,"ok");
        f1.entranamiento();
        System.out.print(f1.entrevista()+"\n");
        f1.partidoFutbol();
    }
}