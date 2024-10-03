import Calculos.Calculos;
import Interacción.Interaccion;

import java.util.Scanner;

public class Pincipal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //Para obetener los elementos desde otras clases:
        Interaccion interaccion = new Interaccion();
        Calculos calculos = new Calculos();
        DatosDeLaApi datosDeLaApi = new DatosDeLaApi();

        // Nuevas Variables:
        var opcionUsuario = interaccion.getOpcionUsusario();



        while (opcionUsuario != 7) {
            System.out.println(interaccion.getMensajeMenu());
            opcionUsuario = teclado.nextInt();

            switch (opcionUsuario) {

                case 1: // Pasar de CLP a USD

                    //System.out.println("Ingrese el monto: ");
                    //opcionUsuario = teclado.nextInt();


                    datosDeLaApi.setMoneda("CLP");

                    System.out.println("Nombre de la moneda: "+ datosDeLaApi.getMoneda());
                    System.out.println("Moneda: "+ datosDeLaApi.getMoneda());
                    System.out.println("Valor del cambio: "+ datosDeLaApi.getClpValue());
                    calculos.getValorConvertido();
                    System.out.println("El Cambio de peso Chileno a Dólar es de: " + calculos.getValorConvertido());
                    break;

                case 2:// Pasar de USD a CLP

                    datosDeLaApi.setMoneda("AUS");
                    System.out.println("Nombre de la moneda: "+ datosDeLaApi.getMoneda());

                    System.out.println("Ingrese el monto: ");
                    opcionUsuario = teclado.nextInt();

                    calculos.getValorConvertido();
                    System.out.println("El Cambio de Dólar a peso Chileno es de: " + calculos.getValorConvertido());
                    break;
                case 3:
                    calculos.getValorConvertido();
                    System.out.println("El Cambio de peso Chileno a Dólar es de: " + calculos.getValorConvertido());
                    break;
                case 4:
                    calculos.getValorConvertido();
                    System.out.println("El Cambio de peso Chileno a Dólar es de: " + calculos.getValorConvertido());
                    break;
                case 5:
                    calculos.getValorConvertido();
                    System.out.println("El Cambio de peso Chileno a Dólar es de: " + calculos.getValorConvertido());
                    break;
                case 6:
                    calculos.getValorConvertido();
                    System.out.println("El Cambio de peso Chileno a Dólar es de: " + calculos.getValorConvertido());
                    break;
                case 7:
                    calculos.getValorConvertido();
                    System.out.println("Saliendo del programa.....");
                    break;
                default:
                    System.out.println("Está opción no es vailda, debes de elegir una de las anteriores");

            }
        }


    }
}

