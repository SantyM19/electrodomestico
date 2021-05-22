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
        this.setTotal(getTotal(consumo.getConsumo(con),procedencia.getProcedencia(pro),tamaño, tdt));

    }


    public Double getTotal(Integer con,Integer pro, double tamaño, Boolean tdt){
        double total = con + pro + 0.0;

        if (tamaño > 40)
            total = total + total * 0.3;

        if (tdt)
            total = total + 250000;


        return total;
    }
}
