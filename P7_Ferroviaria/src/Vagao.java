public class Vagao {
    private int id, capacidadeCarga;
    private Trem trem;

    public Vagao(int id, int capacidadeCarga) {
        this.id = id;
        this.capacidadeCarga = capacidadeCarga;
        this.trem = null;
    }

    public Trem getTrem() {
        return trem;
    }

    public void vincula(Trem t) {
        trem = t;
    }

    public void desvincula() {
        trem = null;
    }

    public int getId() {
        return id;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Vagao [id=" + id + ", capacidadeCarga=" + capacidadeCarga + ", trem=" + trem + "]";
    }
}