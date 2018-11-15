public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int experiencia;

    public Masajista(String id, String nombre, String apellidos, int edad, String titulacion, int experiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.experiencia = experiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public void entranamiento(){
        System.out.print("El masajista esta entrenando sus masajes."+"\n");
    }

    public void partidoFutbol(){
        System.out.print("El masajista esta en un partido conel equipo."+"\n");
    }
    public String darMasaje(){
        String detalle = "El masajista esta en una sesion de masajes.";
        return detalle;
    }
}
