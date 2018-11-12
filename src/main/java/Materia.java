import java.util.List;

public class Materia {
    private String nombre;
    private String key;
    private double nota;
    private double notamin;

    public Materia(String nombre, String key, double nota, double notamin) {
        this.nombre = nombre;
        this.key = key;
        this.nota = nota;
        this.notamin = notamin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNotamin() {
        return notamin;
    }

    public void setNotamin(double notamin) {
        this.notamin = notamin;
    }

    public double Min(List<Materia> materias) {
        double min = 100;
        for (Materia materia : materias) {
            if(materia.getNota()<min){
                min = materia.getNota();
            }
        }
        return min;
    }
}
