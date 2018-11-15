public abstract class SeleccionFutbol {
    private String id;
    private String nombre;
    private String apellidos;
    private int edad;

    public SeleccionFutbol(String id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String viaje (){
        String detalle = "El equipo viajara.";
        return detalle;
    }
    public String concentrarse(){
        String detalle = "El equipo se esta concentrando";
        return detalle;
    }
    public abstract void entranamiento();
    public abstract void partidoFutbol();
}
