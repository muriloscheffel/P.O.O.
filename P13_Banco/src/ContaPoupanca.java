public class ContaPoupanca extends ContaComum {

    public ContaPoupanca(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }
    
    public void computaJuros() {
        this.setSaldo(getSaldo() * 1.05);
    }
}
