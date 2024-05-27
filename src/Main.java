import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int condicion = 0;
        boolean continuar = true; // Variable para controlar la salida del bucle while
        while (continuar) { // Cambiar la condición del bucle while para usar esta variable
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
                    
                    Elija una Opcion:""";
            System.out.println(mensaje);
            condicion = teclado.nextInt();

            // Verificar si el usuario eligió salir
            if (condicion == 7) {
                continuar = false; // Cambiar la variable para salir del bucle
            } else {
                // Solo intentar convertir si la opción es válida
                System.out.println("#----Ingrese el valor que desea convertir----#");
                double valor = teclado.nextDouble();
                switch (condicion) {
                    case 1:
                        try {
                            Conversion.convertirMoneda("USD", "ARS", valor);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            Conversion.convertirMoneda("ARS", "USD", valor);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            Conversion.convertirMoneda("USD", "BRL", valor);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            Conversion.convertirMoneda("BRL", "USD", valor);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        try {
                            Conversion.convertirMoneda("USD", "COP", valor);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 6:
                        try {
                            Conversion.convertirMoneda("CCC", "USD", valor);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Elija una opción valida");
                }
            }
        }
    }
}
