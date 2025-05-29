public class SM_CuentaAhorros extends SM_Cuenta {
    private boolean activa;

    public SM_CuentaAhorros(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        this.activa = saldoInicial >= 5;
    }

    @Override
    public void depositar(float cantidad) {
        if (!activa) {
            System.out.println("La cuenta está inactiva. No se puede depositar.");
            return;
        }
        super.depositar(cantidad);
        actualizarEstado();
    }


    @Override
    public void retirar(float cantidad) {
        if (!activa) {
            System.out.println("La cuenta está inactiva. No se puede retirar.");
            return;
        }
        super.retirar(cantidad);
        actualizarEstado();
    }

    public void imprimir() {
        System.out.printf("Saldo: $%.2f\n", saldo);
        System.out.println("Tasa anual: " + tasaAnual + "%");
        System.out.println("Número de depósitos: " + numDepositos);
        System.out.println("Número de retiros: " + numRetiros);
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
    }

    private void actualizarEstado() {
        this.activa = saldo >= 5;
    }
}
