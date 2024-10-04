import Calculos.Calculos;
import Interacción.Interaccion;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pincipal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        //Para obetener los elementos desde otras clases:
        Interaccion interaccion = new Interaccion();
        Calculos calculos = new Calculos();
        DatosDeLaApi datosDeLaApi = new DatosDeLaApi();

        // Nuevas Variables:



        while (interaccion.getOpcionUsusario() != 7) {
            System.out.println(interaccion.getMensajeMenu());
            interaccion.setOpcionUsusario(teclado.nextInt());


            switch (interaccion.getOpcionUsusario()) {

                case 1: // Pasar de USD a CLP
                    System.out.println("Ingrese el monto: ");
                    datosDeLaApi.setMoneda("CLP");

                    interaccion.setValorMonto(teclado.nextDouble());
                    calculos.setValorMonto(interaccion.getValorMonto());
                    calculos.setValorDolar(datosDeLaApi.getClpValue());

                    System.out.println("(USD A CLP)\n"+" El valor total de la conversion es de: $" + df.format(calculos.getDolaraPeso())+" pesos Chilenos"+"\n");
                    break;

                case 2:// Pasar de CLP a USD
                    System.out.println("Ingrese el monto: ");
                    datosDeLaApi.setMoneda("CLP");

                    interaccion.setValorMonto(teclado.nextDouble());
                    calculos.setValorMonto(interaccion.getValorMonto());
                    calculos.setValorDolar(datosDeLaApi.getClpValue());

                    System.out.println("(CLP A USD)\n"+" El valor total de la conversion es de: USD$" + df.format(calculos.getPesoaDolar())+"\n");
                    break;

                case 3: // De USD a ARS
                    System.out.println("Ingrese el monto: ");
                    datosDeLaApi.setMoneda("ARS");

                    interaccion.setValorMonto(teclado.nextDouble());
                    calculos.setValorMonto(interaccion.getValorMonto());
                    calculos.setValorDolar(datosDeLaApi.getClpValue());

                    System.out.println("(USD A ARS)\n"+"El valor total de la conversion es de: $" + df.format(calculos.getDolaraPeso())+" pesos Argentinos"+"\n");
                    break;

                case 4: // Peso Argentino a Dólar:
                    System.out.println("Ingrese el monto: ");
                    datosDeLaApi.setMoneda("ARS");

                    interaccion.setValorMonto(teclado.nextDouble());
                    calculos.setValorMonto(interaccion.getValorMonto());
                    calculos.setValorDolar(datosDeLaApi.getClpValue());

                    System.out.println("(ARS A USD)\n"+" El valor total de la conversion es de: USD$" + df.format(calculos.getPesoaDolar())+"\n");
                    break;

                case 5: // De USD a BRL
                    System.out.println("Ingrese el monto: ");
                    datosDeLaApi.setMoneda("BRL");

                    interaccion.setValorMonto(teclado.nextDouble());
                    calculos.setValorMonto(interaccion.getValorMonto());
                    calculos.setValorDolar(datosDeLaApi.getClpValue());

                    System.out.println("(USD A BRL)\n"+"El valor total de la conversion es de: $" + df.format(calculos.getDolaraPeso())+" Reales Brasileños"+"\n");
                    break;

                case 6: // De Real Brasileño a Dólar:
                    System.out.println("Ingrese el monto: ");
                    datosDeLaApi.setMoneda("BRL");

                    interaccion.setValorMonto(teclado.nextDouble());
                    calculos.setValorMonto(interaccion.getValorMonto());
                    calculos.setValorDolar(datosDeLaApi.getClpValue());

                    System.out.println("(BRL A USD)\n"+" El valor total de la conversion es de: USD$" + df.format(calculos.getPesoaDolar())+"\n");
                    break;

                case 7: // Salir.
                    System.out.println("\n"+"Saliendo del programa.....");
                    break;

                default:
                    System.out.println("\n"+"Está opción no es vailda, debes de elegir una de las anteriores");

            }
        }


    }
}

