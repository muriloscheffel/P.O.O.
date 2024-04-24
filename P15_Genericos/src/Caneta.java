public class Caneta {
    private String cor, marca;

    public Caneta(String cor, String marca) {
        this.cor = cor;
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Caneta [cor=" + cor + ", marca=" + marca + "]";
    }
}
