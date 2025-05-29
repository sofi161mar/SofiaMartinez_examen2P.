public class SM_CuentaAhorros extends SM_Cuenta {
    private boolean activa;

    public SM_CuentaAhorros(float saldoInicial, float tasaAnual) {
        this.activa = saldoInicial >= 10;
    }

    @Override
    public void depositar(float cantidad) {
        if (!activa) {
            System.out.println("La cuenta está inactiva. No se puede depositar.");
            return;
        }
        if (cantidad > 0) {
            saldo += cantidad;
            numDepositos++;
            if (saldo >= 10) {
                activa = true;
            }
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (!activa) {
            System.out.println("La cuenta está inactiva. No se puede retirar.");
            return;
        }
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            numRetiros++;
            if (saldo < 10) {
                activa = false;
            }
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void imprimir() {
        System.out.println("\n--- Información de la Cuenta de Ahorros ---");
        System.out.printf("Saldo actual: $%.2f\n", saldo);
        System.out.printf("Tasa anual: %.2f%%\n", tasaAnual);
        System.out.println("Número de depósitos: " + numDepositos);
        System.out.println("Número de retiros: " + numRetiros);
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
    }
}
