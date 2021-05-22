package entity;

public class Nevera extends Electrodomestico{

    Double capacidad;

    public Nevera(Character con, String pro, Double capacidad) {
        super(con, pro);
        this.capacidad = capacidad;
        this.setTotal(getTotal(consumo.getConsumo(con),procedencia.getProcedencia(pro), capacidad));

    }

    public Double getTotal(Integer con , Integer pro, Double capacidad){
        double total = con + pro * 1.0;
        double more = (capacidad - 120.0)/10;
        more = Math.round(more);
        if (capacidad > 120.0){
            total = total + total * 0.05 * more;
        }
        return total;
    }


}
