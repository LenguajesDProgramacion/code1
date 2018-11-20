public class Cliente1 extends Persona {
    private int id_cliente;

    public Cliente1(String nombre, int cedula, int edad) {
        super(nombre, cedula, edad);
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    protected void registrarCliente(){
        if(esMayorEdad()){
            System.out.print("Cliente Registrado (Datos): "+"\n");
            System.out.print("Nombre: "+getNombre()+"\n");
            System.out.print("Cedula: "+getCedula()+"\n");
            System.out.print("Edad: "+getEdad()+"\n");
        } else{
            System.out.print("No cumple con los requisitos necesarios.");
        }
    }
    public boolean esMayorEdad(){
        return super.esMayorEdad();
    }
}
