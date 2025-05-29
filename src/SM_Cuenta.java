public class SM_Cuenta {
    protected float saldo;
    protected int numDepositos;
    protected int numRetiros;
    protected float tasaAnual;

    public SM_Cuenta(float saldoInicial, float tasaAnual) {
        this.saldo = saldoInicial;
        this.tasaAnual = tasaAnual;
        this.numDepositos = 0;
        this.numRetiros = 0;
    }

    public void depositar(float monto) {
        if (monto > 0) {
            saldo += monto;
            numDepositos++;
            System.out.println("Depósito exitoso.");
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    public void retirar(float monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            numRetiros=+numRetiros;
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Cantidad inválida o fondos insuficientes.");

        }
    }

    public float getSaldo() {
        return saldo;
    }

    public int getNumDepositos() {
        return numDepositos;
    }

    public int getNumRetiros() {
        return numRetiros;
    }
}
