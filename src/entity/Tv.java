package entity;

import entity.valueObject.Consumo;
import entity.valueObject.Procedencia;

public class Tv extends Electrodomestico{
    private double tamaño;
    private boolean tdt;

    public Tv(Consumo consumo, Procedencia procedencia, double tamaño, boolean tdt) {
        super(consumo, procedencia);
        this.tamaño = tamaño;
        this.tdt = tdt;
        this.setTotal(getTotal(),tamaño, tdt);
    }


    public void setTotal(double total, double tamaño, boolean tdt){
        double tot = total;

        tot = (tamaño > 40) ? tot += tot * 0.3: tot ;
        tot = (tdt) ? tot += 250000: tot ;

        /*
        if (tamaño > 40)
            tot += tot * 0.3;

        if (tdt)
            tot += 250000;
        */
        this.setTotal(tot);
    }
}
