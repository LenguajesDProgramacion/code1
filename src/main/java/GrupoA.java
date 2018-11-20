public class GrupoA extends Cliente{//para todos los grupos B y C
    private double mp;

    public GrupoA(String nombre, int key, double mp) {
        super(nombre, key);
        this.mp = mp;
    }

    public double totalpagar(){
        return (mp >= 10000 ? mp*0.9 : mp);
    }
}
