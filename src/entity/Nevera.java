package entity;

import entity.valueObject.Consumo;
import entity.valueObject.Procedencia;

public class Nevera extends Electrodomestico{

    Double capacidad;

    public Nevera(Consumo consumo, Procedencia procedencia, Double capacidad) {
        super(consumo, procedencia);
        this.capacidad = capacidad;
        this.setTotal( getTotal(),capacidad);
    }

    public void setTotal(double total, Double capacidad){
        double tot = total;
        double more = Math.round((capacidad - 120.0)/10);

        /*
        if (capacidad > 120.0)
            tot = tot + tot * 0.05 * more;
        */

        this.setTotal((capacidad > 120.0)? tot += tot * 0.05 * more : tot);
    }


}
