import java.time.LocalDate;

public class Economica extends Passagem {
    public Economica(LocalDate data, int numeroVoo, double custoBase, int qtdadeBagagem) {
        super(data, numeroVoo, custoBase, 0, false);
    }

    @Override
    public double custoFinal() {
        return this.getCustoBase() * 1.10;
    }
}