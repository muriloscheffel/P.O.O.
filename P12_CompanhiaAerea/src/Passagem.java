import java.time.LocalDate;

public class Passagem {
    private LocalDate data;
    private int numeroVoo, qtdadeBagagem;
    private double custoBase;
    private boolean prioridade;
    
    public Passagem(LocalDate data, int numeroVoo, double custoBase, int qtdadeBagagem, boolean prioridade) {
        this.data = data;
        this.numeroVoo = numeroVoo;
        this.custoBase = custoBase;
        this.qtdadeBagagem = qtdadeBagagem;
        this.prioridade = prioridade;
    }

    public LocalDate getData() {
        return data;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public double getCustoBase() {
        return custoBase;
    }

    public int getQtdadeBagagem() {
        return qtdadeBagagem;
    }

    public boolean prioridade() {
        return prioridade;
    }

    public void setPrioridade(boolean prioridade) {
        this.prioridade = prioridade;
    }

    public double custoFinal() {
        return -1;
    }

    @Override
    public String toString() {
        return "data=" + data + ", numeroVoo=" + numeroVoo + ", qtdadeBagagem=" + qtdadeBagagem
                + ", custoBase=" + custoBase + ", prioridade=" + prioridade + ", custoFinal=R$" + this.custoFinal();
    }    
}