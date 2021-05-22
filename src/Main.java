import entity.Electrodomestico;
import util.Menu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos = Menu.construirElectro();

        System.out.println("==========================================");
        System.out.println("=       Lista de Electrodomesticos       =");
        System.out.println("==========================================");
        for(Electrodomestico electro : electrodomesticos){
            System.out.println(electro.toString());
        }
        System.out.println("==========================================");
    }
}
