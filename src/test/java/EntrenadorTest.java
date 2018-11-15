import org.junit.Test;

import static org.junit.Assert.*;

public class EntrenadorTest {
    @Test
    public void entrenador(){
        Entrenador e1 = new Entrenador("1","Carlos","Camacho", 35,45);
        e1.entranamiento();
        System.out.print(e1.planificarEntrenamiento()+"\n");
        e1.partidoFutbol();
    }
}