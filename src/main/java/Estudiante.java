import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private String nombre;
    private String apellido;
    private int ci;
    private int edad;
    private List<Materia> materias;

    public Estudiante(String nombre, String apellido, int ci, int edad) {
        super(nombre, apellido, ci, edad);
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.edad = edad;
        this.materias = new ArrayList<>();
    }

     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getMateria(String key, List<Materia> materias){
        String detalle = "";
        for (Materia materia: materias) {
            if (materia.getKey().equals(key)){
                detalle = materia.getKey()+"\n"+materia.getNombre()+"\n"+materia.getNota();
                break;
            }
        }
        return detalle;
    }
}
