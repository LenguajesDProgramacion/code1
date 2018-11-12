import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String key;
    private String nombre;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;
    private List<Empleado> emp;

    public Empleado(String key, String nombre, String cedula, int edad, boolean casado, double salario) {
        this.key = key;
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
        this.emp = new ArrayList<>();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String tipo(String key) {
        String cc = "";
        int e = getEdad();
        boolean b;
            if (e <= 21) {
                cc = ("Principiante");
            } else if (e >= 22 && e <= 35) {
                cc = ("Intermedio ");
            } else if (e >= 35) {
                cc = ("Senior");
            }
        return cc;
    }
    public double salarioAct(String key, double porcen){
        double e = getSalario();
        double r = 0;
        porcen = porcen/100+1.0;
        r = porcen * e;
        return  r;
    }
}
