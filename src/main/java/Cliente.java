public abstract class Cliente {
    private String nombre;
    private int key;

    public  Cliente(String nombre, int key){
        this.nombre = nombre;
        this.key = key;
    }

    public abstract double totalpagar();
}
