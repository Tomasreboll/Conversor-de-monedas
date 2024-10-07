package Calculos;




public class Calculos{



    private double valorMonto;
    private double valorDolar;


    private double dolaraPeso = valorMonto * valorDolar;
    private double pesoaDolar = valorMonto / valorDolar;


    // getters y setters a utilizar:

    private void actualizarpesoADolar() {
        this.dolaraPeso = valorMonto * valorDolar;
    }

    private void actualizardolarAPeso() {
        this.pesoaDolar = valorMonto / valorDolar;
    }

    public double getValorMonto() {
        return valorMonto;
    }

    public void setValorMonto(double valorMonto) {
        this.valorMonto = valorMonto;
        actualizarpesoADolar();
        actualizardolarAPeso();
    }

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
        actualizarpesoADolar();
        actualizardolarAPeso();
    }

    public double getDolaraPeso() {
        return dolaraPeso;
    }

    public void setDolaraPeso(double dolaraPeso) {
        this.dolaraPeso = dolaraPeso;
    }

    public double getPesoaDolar() {
        return pesoaDolar;
    }

    public void setPesoaDolar(double pesoaDolar) {
        this.pesoaDolar = pesoaDolar;
    }
}