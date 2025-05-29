import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        float saldoInicial = scanner.nextFloat();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        float tasaAnual = scanner.nextFloat();

        SM_CuentaAhorros cuenta = new SM_CuentaAhorros(saldoInicial, tasaAnual);

        int opcion;
        do {
            System.out.println("\n----- MENÚ -----");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver saldo actual");
            System.out.println("4. Imprimir información de la cuenta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuánto desea depositar? ");
                    float deposito = scanner.nextFloat();
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("¿Cuánto desea retirar? ");
                    float retiro = scanner.nextFloat();
                    cuenta.retirar(retiro);
                    break;
                case 3:
                    System.out.printf("Saldo actual: $%.2f\n", cuenta.getSaldo());
                    System.out.println("Número de depósitos: " + cuenta.getNumDepositos());
                    System.out.println("Número de retiros: " + cuenta.getNumRetiros());
                    break;
                case 4:
                    cuenta.imprimir();
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
