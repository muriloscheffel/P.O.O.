public class App {
    public static void main(String[] args) throws Exception {
        ContaComum conta = new ContaComum(1, 1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, 200.00);
        ContaLimite contaLimite = new ContaLimite(3, 500.0, 300.0);
    }
}
