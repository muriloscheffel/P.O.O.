public class ContaComum {
    private int numeroConta;
    private double saldo;

    public ContaComum(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;

    }
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean deposito(double v) {
        if(v <= 0) {
            return false;
        }
        this.saldo = saldo + v;
        return true;
    }

    public boolean saque(double v) {
        if(v > saldo || v <= 0) {
            return false;
        }
        this.saldo = saldo - v;
        return true;
    }

    @Override
    public String toString() {
        return "numeroConta=" + numeroConta + ", saldo=" + saldo;
    }
}