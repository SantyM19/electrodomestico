package entity.valueObject;

import java.util.HashMap;

public class Procedencia {

    private final HashMap<String, Integer> procedencia = new HashMap<String, Integer>();

    public Procedencia() {

        procedencia.put("Nacional", 250000);
        procedencia.put("Importado", 350000);

    }

    public Integer getProcedencia(String pro){
        return procedencia.get(pro);
    }
}
