package entity;

import entity.valueObject.Consumo;
import entity.valueObject.Procedencia;

public class Electrodomestico {

    private final Integer consumoPrecio;
    private final Integer procedenciaPrecio;
    private Double total;


    Consumo consumo = new Consumo();
    Procedencia procedencia = new Procedencia();

    public Electrodomestico(Character con, String pro) {
        this.consumoPrecio = consumo.getConsumo(con);  // 25000 3500 -> key
        this.procedenciaPrecio = procedencia.getProcedencia(pro);
        this.total = consumo.getConsumo(con) + procedencia.getProcedencia(pro) + 0.0;
    }

    public Integer getConsumoPrecio() {
        return consumoPrecio;
    }

    public Integer getProcedenciaPrecio() {
        return procedenciaPrecio;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}
