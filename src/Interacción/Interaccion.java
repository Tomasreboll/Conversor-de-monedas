package Interacción;

public class Interaccion {

    private int opcionUsusario;
    private String moneda1;
    private String moneda2;
    private String mensajeMenu = "" +
            "**********************************\n"+
            "Sea Bienvenido/a al Conversor de monedas =D\n"+
            "                         \n"+
            "1) Dólar a peso Argentino\n"+
            "2) Peso Argentino a Dólar\n"+
            "3) Dólar a peso Chileno\n"+
            "4) Peso Chileno a Dólar\n"+
            "5) Dólar a real Brasileño\n"+
            "6) Real Brasileño a Dólar\n"+
            "7) Salir\n"+
            "Elija una de las opciones anteriores";

    private double valorDolar;
    private double valorMoneda2;

    // Todos los getters y Setters a utilizar:
    public String getMensajeMenu() {
        return mensajeMenu;
    }

    public double getValorDolar() {
        return valorDolar;
    }

    public double getValorMoneda2() {
        return valorMoneda2;
    }

    public int getOpcionUsusario() {
        return opcionUsusario;
    }
}
