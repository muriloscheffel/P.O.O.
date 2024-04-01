public class Locomotiva {
    private int id, capacidadeCarga, nroMaxVagoes;

    public Locomotiva(int id, int capacidadeCarga, int nroMaxVagoes) {
        this.id = id;
        this.capacidadeCarga = capacidadeCarga;
        this.nroMaxVagoes = nroMaxVagoes;
    }

    public int getId() {
        return id;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public int getNroMaxVagoes() {
        return nroMaxVagoes;
    }

    @Override
    public String toString() {
        return "Locomotiva [id=" + id + ", capacidadeCarga=" + capacidadeCarga + ", nroMaxVagoes=" + nroMaxVagoes + "]";
    }
}
