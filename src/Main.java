import entity.Electrodomestico;
import entity.Nevera;
import entity.Tv;
import entity.valueObject.Consumo;
import entity.valueObject.Procedencia;

public class Main {
    public static void main(String[] args) {

        Electrodomestico microH = new Electrodomestico(Consumo.A, Procedencia.INTERNACIONAL);

        Nevera nevera = new Nevera ('B',"Importado",130.0);

        Tv tv = new Tv(Consumo.B,Procedencia.NACIONAL,40,true);

        System.out.println(microH.getTotal());
    }
}
