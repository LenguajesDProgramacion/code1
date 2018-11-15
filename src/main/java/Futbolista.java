public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public Futbolista(String id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    public void entranamiento(){
        System.out.print("El futbolista esta entrenando."+"\n");
    }

    public void partidoFutbol(){
        System.out.print("El futbolista esta en un partido."+"\n");
    }
    public String entrevista(){
        String detalle = "El futbolista esta en una entrevista.";
        return detalle;
    }
}
