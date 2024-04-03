import java.time.LocalDate;

public class Executiva extends Passagem{
    public Executiva(LocalDate data, int numeroVoo, double custoBase, int qtdadeBagagem) {
        super(data, numeroVoo, custoBase, qtdadeBagagem);
        /*
        if(getQtdadeBagagem() > 1) {
            throw new IllegalArgumentException("Quantidade de bagagem excedeu");
        }
        */
    }

    @Override
    public double custoFinal() {
        return getCustoBase() * 1.3;
    }
}
