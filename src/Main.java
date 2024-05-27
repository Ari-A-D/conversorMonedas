import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int condicion = 0;
        while (condicion != 7){
            Scanner teclado = new Scanner(System.in);
            String mensaje = """
                    ******************************************
                    *Sea bienvenido/a al Conversor de Monedas*
                    ******************************************
                    ------------------------------------------
                    *****Seleccione el tipo de conversion*****
                    
                    1 - Dólar a Peso Argentino
                    2 - Peso Argentino a Dólar
                    3 - Dólar a Real Brasileño
                    4 - Real Brasileño a Dólar
                    5 - Dólar a Peso Colombiano
                    6 - Peso colombiano a Dólar
                    7 - Salir
                    
                    ****************************************
                    ----------------------------------------
                    *******
                    Opcion:
                    *******""";
            System.out.println(mensaje);
            condicion = teclado.nextInt();
            System.out.println("#----Ingrese el valor que desea convertir----#");
            double valor = teclado.nextDouble();
            switch (condicion){
                case 1:
                    System.out.println("opcion1");
                    break;
                case 2:
                    System.out.println("opcion2");
                    break;
                case 3:
                    System.out.println("opcion3");
                    break;
                case 4:
                    System.out.println("opcion4");
                    break;
                case 5:
                    System.out.println("opcion5");
                    break;
                case 6:
                    System.out.println("opcion6");
                    break;
                case 7:
                    System.out.println("opcion7");
                    break;
                default:
                    System.out.println("Elija una opcion valida");
            }
        }
    }
}