public class Administrador extends Persona {
    private int di_administrador;

    public int getDi_administrador() {
        return di_administrador;
    }

    public void setDi_administrador(int di_administrador) {
        this.di_administrador = di_administrador;
    }

    public Administrador(String nombre, int cedula, int edad) {
        super(nombre, cedula, edad);
    }

    public boolean esMayorEdad(){
        return super.esMayorEdad();
    }

    protected void registrarAdm(){
        if(esMayorEdad()){
            System.out.print("Administrador Registrado (Datos): "+"\n");
            System.out.print("Nombre: "+getNombre()+"\n");
            System.out.print("Cedula: "+getCedula()+"\n");
            System.out.print("Edad: "+getEdad()+"\n");
        }else{
            System.out.print("No cumple con los requisitos necesarios.");
        }
    }
}
