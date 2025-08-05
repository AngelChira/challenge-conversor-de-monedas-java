import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcion;
        double cantidadFormateada;
        String monedaOrigen = "", monedaDestino = "";
        do {
            while (true) {
                System.out.println("***************************************************");
                System.out.println("Sea bienvenido al conversor de monedas");
                System.out.println("\n1) Dolar =>> Peso Argentino");
                System.out.println("2) Peso Argentino =>> Dolar");
                System.out.println("3) Dolar =>> Real Brasileño");
                System.out.println("4) Real Brasileño =>> Dolar");
                System.out.println("5) Dolar =>> Peso Colombiano");
                System.out.println("6) Peso Colombiano =>> Dolar");
                System.out.println("7) Salir");
                System.out.println("Elija una opción: ");
                System.out.println("***************************************************");
                try {
                    opcion = sc.nextByte();
                    if (opcion >= 1 && opcion <= 7) {
                        break;
                    } else {
                        System.out.println("Opción no válida, por favor intente de nuevo.");
                    }
                } catch (Exception e) {
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    sc.next(); // Limpiar el buffer del scanner
                }
            }

            if (opcion == 7) {
                System.out.println("Conversor finalizado.");
                sc.close();
                return;
            }

            while (true) {
                try {
                    System.out.println("Ingrese la cantidad a convertir: ");
                    double cantidad = sc.nextDouble();
                    cantidadFormateada = Math.round(cantidad * 100.0) / 100.0;
                    if (cantidadFormateada < 0) {
                        System.out.println("La cantidad no puede ser negativa, por favor intente de nuevo.");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Error, por favor ingrese una cantidad valida.");
                    sc.next(); // Limpiar el buffer del scanner
                }
            }

            switch (opcion) {
                case 1:
                    monedaOrigen = "USD";
                    monedaDestino = "ARS";
                    break;
                case 2:
                    monedaOrigen = "ARS";
                    monedaDestino = "USD";
                    break;
                case 3:
                    monedaOrigen = "USD";
                    monedaDestino = "BRL";
                    break;
                case 4:
                    monedaOrigen = "BRL";
                    monedaDestino = "USD";
                    break;
                case 5:
                    monedaOrigen = "USD";
                    monedaDestino = "COP";
                    break;
                case 6:
                    monedaOrigen = "COP";
                    monedaDestino = "USD";
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    continue;
            }
            Moneda moneda = new ConsultarCambioMoneda().obtenerCambio(monedaOrigen, monedaDestino);
            double conversion = cantidadFormateada * moneda.getResultado();
            System.out.printf("%.2f %s = %.2f %s", cantidadFormateada, monedaOrigen, conversion, monedaDestino);
            System.out.println("\n");
        } while (true);
    }
}
