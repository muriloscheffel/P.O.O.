public class Locomotiva {
    private int id, capacidadeCarga, nroMaxVagoes;
    private Trem trem;

    public Locomotiva(int id, int capacidadeCarga, int nroMaxVagoes) {
        this.id = id;
        this.capacidadeCarga = capacidadeCarga;
        this.nroMaxVagoes = nroMaxVagoes;
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

    public int getNroMaxVagoes() {
        return nroMaxVagoes;
    }

    @Override
    public String toString() {
        return "Locomotiva [id=" + id + ", capacidadeCarga=" + capacidadeCarga + ", nroMaxVagoes=" + nroMaxVagoes
                + ", trem=" + trem + "]";
    }
    
}