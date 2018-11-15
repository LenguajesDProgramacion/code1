public class GrupoC extends Empresa {
    public double montop;

    public GrupoC(String nombre, String key, String total, double montop) {
        super(nombre, key, total);
        this.montop = montop;
    }

    public void nombreclie(){
        System.out.print("El nombre del cliente: ");
    }

    public double descuento(){
        if (montop > 100000){
            return (montop*0.98);
        } else{
            return  montop;
        }
    }
}
