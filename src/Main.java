import entity.Electrodomestico;
import entity.Nevera;
import entity.Tv;
import entity.valueObject.Consumo;
import entity.valueObject.Procedencia;

public class Main {
    public static void main(String[] args) {

        Electrodomestico microH = new Electrodomestico(Consumo.A, Procedencia.INTERNACIONAL);

        Nevera nevera = new Nevera (Consumo.C, Procedencia.INTERNACIONAL,130.0);

        Tv tv = new Tv(Consumo.B,Procedencia.NACIONAL,40,true);

        System.out.println(tv.getTotal());
    }
}
