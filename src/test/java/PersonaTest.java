import org.junit.Test;

import static org.junit.Assert.*;

public class PersonaTest {
    @Test
    public void persona(){
        Cliente1 c1 = new Cliente1("Diego",44456565,21);
        c1.registrarCliente();
        Administrador a1 = new Administrador("Luis",746262626,19);
        a1.registrarAdm();
    }
}