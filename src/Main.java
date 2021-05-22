import entity.Electrodomestico;
import entity.Nevera;
import entity.Tv;

public class Main {
    public static void main(String[] args) {

        Electrodomestico microH = new Electrodomestico('A',"Nacional");


        Nevera nevera = new Nevera ('B',"Importado",130.0);


        Tv tv = new Tv('C',"Nacional",40,true);

        System.out.println(nevera.getTotal());
    }
}
