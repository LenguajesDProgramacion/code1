public abstract class Empresa {
    private String nombre;
    private String key;
    private String total;

    public Empresa(String nombre, String key, String total) {
        this.nombre = nombre;
        this.key = key;
        this.total = total;
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

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public abstract void nombreclie();
}
