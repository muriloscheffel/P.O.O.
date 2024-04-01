public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getINSS() {
        return getSalarioBase() * 0.1;
    }

    public double getSalarioLiquido() {
        return getSalarioBase() - getINSS();
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", salarioBase=" + salarioBase + " salarioLiquido=" + getSalarioLiquido();
    }
}