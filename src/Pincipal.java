import Calculos.Calculos;
import Interacción.Interaccion;

import java.util.Scanner;

public class Pincipal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //int opcionUsuario = 0;
        //Para obetener los elementos desde otras clases:
        Interaccion interaccion = new Interaccion();
        Calculos calculos = new Calculos();
        DatosDeLaApi datosDeLaApi = new DatosDeLaApi();

        var opcionUsuario = interaccion.getOpcionUsusario();





        while (opcionUsuario != 7) {

            System.out.println(interaccion.getMensajeMenu());
            opcionUsuario = teclado.nextInt();

            switch (opcionUsuario) {

                case 1:
                    System.out.println("Ingrese el monto: ");
                    opcionUsuario = teclado.nextInt();

                    calculos.getValorConvertido();
                    System.out.println("El Cambio de peso Chileno a Dólar es de: " + calculos.getValorConvertido());
                    break;
                case 2:
                    calculos.getValorConvertido();
                    System.out.println("El Cambio de peso Chileno a Dólar es de: " + calculos.getValorConvertido());
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

