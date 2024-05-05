import java.util.ArrayList;

public class Trem {
    private int id;
    private ArrayList<VeiculoFerroviario> veiculos;

    public Trem(int id, Locomotiva locomotiva) {
        this.id = id;
        this.veiculos = new ArrayList<>();
        engataLocomotiva(locomotiva);   
    }

    public boolean engataLocomotiva(Locomotiva locomotiva) {
        if(veiculos.size() > 0) {
            return false;
        }
        veiculos.add(locomotiva);
        locomotiva.vincula(this);
        return true;        
    }

    public boolean engataVagao(Vagao vagao){
        if (limiteDeVagoesAtingido() || pesoMaximoDosVagoesAtingido()){
            return false;
        }
        veiculos.add(vagao);
        vagao.vincula(this);
        return true;
    }

    // Métodos auxiliares
    private boolean limiteDeVagoesAtingido(){
        int qtdade = 0;
        for(VeiculoFerroviario l:veiculos){
            if(l instanceof Locomotiva) {
                Locomotiva loc = (Locomotiva)l;
                qtdade += loc.getNroMaxVagoes();
            }
        }
        return veiculos.size() >= qtdade;
    }

    private double pesoMaximoLocomotivasTracionam(){
        double peso = 0;
        double tx = 1.0;
        for(VeiculoFerroviario l:veiculos){
            if(l instanceof Locomotiva) {
                Locomotiva loc = (Locomotiva)l;
                peso += loc.getCapacidadeCarga() * tx;
                tx *= 0.9;
            }
        }
        return peso;
    }

    private boolean pesoMaximoDosVagoesAtingido(){
        double peso = 0.0;
        for(VeiculoFerroviario v : veiculos){
            if(v instanceof Vagao) {
                Vagao vag = (Vagao)v;
                peso += vag.getCapacidadeCarga();
            }
        } 
        return peso >= pesoMaximoLocomotivasTracionam();
    }

    @Override
    public String toString(){
        String aux = "T"+id+"+";
        for(VeiculoFerroviario l : veiculos){
            aux += "[L"+l.getId()+"]+";
        }
        return aux;
    }
 }