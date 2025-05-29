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


}
