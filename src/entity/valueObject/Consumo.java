package entity.valueObject;

public enum Consumo {
    A(450000D), B(350000D), C(250000D);
    private final double consumo;

    Consumo(double consumo) {
        this.consumo = consumo;
    }

    public double getConsumo() {
        return consumo;
    }
}