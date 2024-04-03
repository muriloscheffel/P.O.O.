public class ContaLimite extends ContaComum {
    private double limite;

    public ContaLimite(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public boolean saque(double v) {
        if(v > (this.getSaldo() + limite) || v <= 0) {
            return false;
        }
        this.setSaldo(this.getSaldo() - v);
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ", limite=" + limite;
    }
}
