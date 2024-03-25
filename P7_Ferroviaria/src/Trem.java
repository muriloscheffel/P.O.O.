import java.util.ArrayList;

public class Trem {
    private int id;
    private ArrayList<Vagao> vagoes;
    private ArrayList<Locomotiva> locomotivas;

    public Trem(int id, Locomotiva locomotiva) {
        this.id = id;
    }

    public boolean engataLocomotiva(Locomotiva locomotiva) {
        if(vagoes.size() > 0) {
            return false;
        }
        locomotivas.add(locomotiva);
        locomotiva.vincula(this);
        return true;        
    }

    public boolean engataVagao(Vagao vagao) {
        if(limiteDeVagoesAtingido() || pesoMaximoDosVagoesAtingido()) {
            return false;
        }
        vagoes.add(vagao);
        vagao.vincula(this);
        return true;
    }

    public Vagao desengataVagao(){
        if(vagoes.size() == 0) {
            return null;
        }
        Vagao aux = vagoes.remove(vagoes.size() - 1);
        aux.desvincula();
        return aux;
    }

    public String toString(){
        String aux = "T"+id+"+";
        for(Locomotiva l:locomotivas){
            aux += "[L"+l.getId()+"]+";
        }
        for(Vagao v:vagoes){
            aux += "[V"+v.getId()+"]+";
        }
        return aux;
    }

    private boolean limiteDeVagoesAtingido(){
        int qtdade = 0;
        for(Locomotiva l : locomotivas) {
            qtdade += l.getNroMaxVagoes();
        }
        return vagoes.size() >= qtdade;
    }

    private double pesoMaximoLocomotivasTracionam(){
        double peso = 0;
        double tx = 1.0;
        for(Locomotiva l : locomotivas) {
            peso += l.getCapacidadeCarga() * tx;
            tx *= 0.9;
        }
        return peso;
    }

    private boolean pesoMaximoDosVagoesAtingido(){
        double peso = 0;
        for(Vagao v : vagoes) {
            peso += v.getCapacidadeCarga();
        }
        return peso >= pesoMaximoLocomotivasTracionam();
    }
}