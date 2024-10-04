package Interacción;

public class Interaccion {

    private int opcionUsusario;
    private String mensajeMenu = "" +
            "**********************************\n"+
            "Sea Bienvenido/a al Conversor de monedas =D\n"+
            "                         \n"+
            "1) Dólar a peso Chileno\n"+
            "2) Peso Chileno a Dólar\n"+
            "3) Dólar a peso Argentino\n"+
            "4) Peso Argentino a Dólar\n"+
            "5) Dólar a real Brasileño\n"+
            "6) Real Brasileño a Dólar\n"+
            "7) Salir\n"+
            "Elija una de las opciones anteriores";

    private double valorDolar;
    private double valorMonto;

    // Todos los getters y Setters a utilizar:


    public int getOpcionUsusario() {
        return opcionUsusario;
    }

    public void setOpcionUsusario(int opcionUsusario) {
        this.opcionUsusario = opcionUsusario;
    }

    public String getMensajeMenu() {
        return mensajeMenu;
    }

    public void setMensajeMenu(String mensajeMenu) {
        this.mensajeMenu = mensajeMenu;
    }

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    public double getValorMonto() {
        return valorMonto;
    }

    public void setValorMonto(double valorMonto) {
        this.valorMonto = valorMonto;
    }
}
