public class Professor extends Funcionario{
    private int cargaHoraria;

    public Professor(String nome, double salarioBase, int cargaHoraria) {
        super(nome, salarioBase);
        this.cargaHoraria = cargaHoraria;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getValorHora() {
        return getSalarioBase() / 44;
    }

    @Override
    public double getSalarioLiquido() {
        return (getValorHora() * getCargaHoraria()) - getINSS();
    }

    @Override
    public String toString() {
        return super.toString() + " cargaHoraria=" + cargaHoraria;
    }
}
