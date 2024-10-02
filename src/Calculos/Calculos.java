package Calculos;


import Interacción.Interaccion;

public class Calculos extends Interaccion{

    Interaccion monedas = new Interaccion();

    @Override
    public double getValorDolar() {
        return super.getValorDolar();
    }

    @Override
    public double getValorMoneda2() {
        return super.getValorMoneda2();
    }

    private double valorConvertido = getValorDolar() * getValorMoneda2();

    public double getValorConvertido() {
        return valorConvertido;
    }
}
