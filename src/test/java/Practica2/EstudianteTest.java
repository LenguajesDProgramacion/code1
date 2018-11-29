package Practica2;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EstudianteTest {
    @Test
    public void estudainte() {
        Estudiante estudiante = new Estudiante("Luis", "Castellon", 21);
        Materia materia1 = new Materia("Ingles", "123A", 35);
        Materia materia2 = new Materia("Lenguaje", "123B", 98);
        List<Materia> m = new ArrayList<>();
        m.add(materia1);
        m.add(materia2);
        System.out.println("Las materias reprobadas son: "+estudiante.verMateriasReprobadas(m));
        System.out.print("Las materias aprobadas son: "+estudiante.verMateriasAprobadas(m));
    }
}