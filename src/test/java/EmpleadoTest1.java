import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EmpleadoTest1 {
    @Test
    public void empleado(){
        Empleado emp = new Empleado("A1", "Luis", "13379311", 44,false,1850);
        List<Empleado> e = new ArrayList<>();
        e.add(emp);
        System.out.println("Nombre: "+emp.getNombre()+"\n"+"Cedula: "+emp.getCedula()+"\n"+"Edad: "+emp.getEdad()+"\n"+"Casado: "+emp.isCasado()+"\n"+"Salario: "+emp.getSalario());
        System.out.println("Tipo de programador: "+emp.tipo("A1"));
    }
}