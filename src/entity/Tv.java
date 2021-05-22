package entity;

import entity.valueObject.Consumo;
import entity.valueObject.Procedencia;

public class Tv extends Electrodomestico{
    double tamaño;
    Boolean tdt;

    public Tv(Consumo consumo, Procedencia procedencia, double tamaño, Boolean tdt) {
        super(consumo, procedencia);
        this.tamaño = tamaño;
        this.tdt = tdt;
        this.setTotal(getTotal(),tamaño, tdt);
    }


    public Double setTotal(double total, double tamaño, Boolean tdt){
        double tot = total;

        if (tamaño > 40)
            tot = tot + tot * 0.3;

        if (tdt)
            tot = tot + 250000;

        return tot;
    }
}
