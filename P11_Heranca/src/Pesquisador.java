public class Pesquisador extends Professor {
    private int cargaHorariaPesquisa;

    public Pesquisador(String nome, double salarioBase, int cargaHoraria, int cargaHorariaPesquisa) {
        super(nome, salarioBase, cargaHoraria);
        this.cargaHorariaPesquisa = cargaHorariaPesquisa;
    }

    public int getCargaHorariaPesquisa() {
        return cargaHorariaPesquisa;
    }

    public int getCargaHorariaTotal() {
        return getCargaHoraria() + getCargaHorariaPesquisa();
    }

    @Override
    public double getSalarioLiquido() {
        return getCargaHorariaTotal() * getValorHora() - getINSS();
    }

    @Override
    public String toString() {
        return super.toString() + " cargaHorariaPesquisa=" + cargaHorariaPesquisa;
    }    
}