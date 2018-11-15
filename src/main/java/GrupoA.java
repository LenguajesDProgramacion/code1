public class GrupoA extends Empresa {
    public double montop;

    public GrupoA(String nombre, String key, String total, double montop) {
        super(nombre, key, total);
        this.montop = montop;
    }

    public void nombreclie(){
        System.out.print("El nombre del cliente: ");
    }

    public double descuento(){
        if (montop > 100000){
            return (montop*0.9);
        } else{
            return  montop;
        }
    }
}
