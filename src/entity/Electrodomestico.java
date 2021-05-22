package entity;

import entity.valueObject.Consumo;
import entity.valueObject.Procedencia;

public class Electrodomestico {

    private final Double consumoPrecio;
    private final Double procedenciaPrecio;
    private Double total;

    public Electrodomestico(Consumo consumo, Procedencia procedencia) {
        this.consumoPrecio = consumo.getConsumo();  // 25000 3500 -> key
        this.procedenciaPrecio = procedencia.getRecargo() * 1.0;

        //this.total = this.consumoPrecio + this.procedenciaPrecio;
        //this.total = consumo.getConsumo() + procedencia.getRecargo();

        this.total = getConsumoPrecio() + getProcedenciaPrecio();
    }

    public Double getConsumoPrecio() {
        return consumoPrecio;
    }

    public Double getProcedenciaPrecio() {
        return procedenciaPrecio;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Electrodoméstico: " +
                "\n consumoPrecio = " + consumoPrecio +
                "\n procedenciaPrecio = " + procedenciaPrecio +
                "\n total = " + total +
                '\n';
    }
}
