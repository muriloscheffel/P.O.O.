import java.time.LocalDate;

public class PrimeiraClasse extends Executiva{
    public PrimeiraClasse(LocalDate data, int numeroVoo, double custoBase, int qtdadeBagagem) {
        super(data, numeroVoo, custoBase, qtdadeBagagem);
        this.setPrioridade(true);
    }

    @Override
    public double custoFinal() {
        return super.custoFinal() * 1.5;
    }
}
