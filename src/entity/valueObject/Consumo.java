package entity.valueObject;

import java.util.HashMap;

public class Consumo {
    private final HashMap<Character, Integer> consumo = new HashMap<Character, Integer>();

    public Consumo() {

        consumo.put('A', 250000);
        consumo.put('B', 350000);
        consumo.put('C', 350000);

    }

    public Integer getConsumo(Character con){
        return consumo.get(con);
    }
}
