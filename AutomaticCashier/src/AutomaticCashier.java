import java.util.Scanner;

public class AutomaticCashier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Saldo inicial
        var saldo = 1000.0;
        int opcion;

        do {
            // Menu
            System.out.println("\n--- Bienvenido al cajero automático ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nSaldo actual: $" + saldo);
                    break;

                case 2:
                    System.out.print("\nIngrese monto a depositar: $");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Monto depositado con éxito.");
                    break;

                case 3:
                    System.out.print("\nIngrese monto a retirar: $");
                    double retiro = sc.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente. No se puede realizar el retiro.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso.");
                    }
                    break;

                case 4:
                    System.out.println("\nGracias por usar el cajero automático. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("\nOpción inválida. Intente nuevamente.");
                    continue;
            }

        } while (opcion != 4);

        sc.close();
    }
}
