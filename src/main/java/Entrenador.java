public class Entrenador extends SeleccionFutbol {
    private int IdFeracion;

    public Entrenador(String id, String nombre, String apellidos, int edad, int idFeracion) {
        super(id, nombre, apellidos, edad);
        IdFeracion = idFeracion;
    }

    public int getIdFeracion() {
        return IdFeracion;
    }

    public void setIdFeracion(int idFeracion) {
        IdFeracion = idFeracion;
    }
    public void entranamiento(){
        System.out.print("El entrenador esta entrenando a los futbolistas."+"\n");
    }

    public void partidoFutbol(){
        System.out.print("El futbolista esta apoyando al equipo en el partido."+"\n");
    }
    public String planificarEntrenamiento(){
        String detalle = "El entrenador esta planificando un partido.";
        return detalle;
    }
}
