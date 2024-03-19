public class Deck {
    public static final int MAX_CARTAS = 104;
    private Carta[] cartas;
    private int proxLivre;

    public Deck() {
        cartas = new Carta[MAX_CARTAS];
        proxLivre = 0;
    }

    public void insereEmCima(Carta carta) {
        if (proxLivre < MAX_CARTAS) {
            cartas[proxLivre] = carta;
            proxLivre++;
        }
    }

    public Carta retiraDeBaixo() {
        if (proxLivre > 0) {
            proxLivre--;
            return cartas[proxLivre];
        }
        return null;
    }

    public int qtdadeCartas() {
        return proxLivre;
    }

    public int somaDosValores() {
        int soma = 0;
        for (int i = 0; i < proxLivre; i++) {
            soma += cartas[i].getValor().getValor();
        }
        return soma;
    }

    public void embaralha() {
        for (int i = 0; i < proxLivre; i++) {
            int j = (int) (Math.random() * proxLivre);
            Carta temp = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = temp;
        }
    }

    public void reset() {
        
    }
}
