package Interacción;

public class Interaccion {

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



    public String getMensajeMenu() {
        return mensajeMenu;
    }
}
