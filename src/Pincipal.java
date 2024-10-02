import Calculos.Calculos;
import Interacción.Interaccion;

public class Pincipal {

    public static void main(String[] args) {
        //Todos los elementos a utilizar dentro del main desde otras clases:
        Interaccion mensajeMenu = new Interaccion();
        Calculos valorTotal = new Calculos();


        System.out.println(mensajeMenu.getMensajeMenu());

        System.out.println(valorTotal.getValorConvertido());

    }
}
