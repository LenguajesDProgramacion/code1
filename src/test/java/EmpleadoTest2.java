import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EmpleadoTest2 {
    @Test
    public void empleado(){
        Empleado emp = new Empleado("A1", "Luis", "13379311", 22,false,1850);
        List<Empleado> e = new ArrayList<>();
        e.add(emp);
        System.out.println("Salario Actualizado: "+emp.salarioAct("A1",4.5));
    }
}