package Calculos;


import Interacción.Interaccion;

public class Calculos extends Interaccion{

    Interaccion monedas = new Interaccion();

    @Override
    public double getValorMoneda1() {
        return super.getValorMoneda1();
    }

    @Override
    public double getValorMoneda2() {
        return super.getValorMoneda2();
    }

    private double valorConvertido = getValorMoneda1() * getValorMoneda2();

    public double getValorConvertido() {
        return valorConvertido;
    }
}
