package Practica2;
import java.util.List;

public class Estudiante extends Persona {
    private List<Materia> materias;

    public Estudiante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public String verMateriasReprobadas(List<Materia> materias) {
        String detalle = "";
        double min = 51;
        for (Materia materia : materias) {
            if(materia.getNota()<min) {
                detalle = materia.getKey() + "\n" + materia.getNombre() + "\n" + materia.getNota();
                break;
                }
            }
        return detalle;
    }
    public String verMateriasAprobadas(List<Materia> materias) {
        String detalle = "";
        double min = 51;
        for (Materia materia : materias) {
            if(materia.getNota()>=min) {
                detalle = materia.getKey() + "\n" + materia.getNombre() + "\n" + materia.getNota();
                break;
            }
        }
        return detalle;
    }
}
