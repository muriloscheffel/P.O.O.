import java.util.ArrayList;

public class GaragemVagoes {
    private static final int MAX_VAGOES = 100;
    private ArrayList<Vagao> vagoes;

    private void carregaVagoes() {
        for(int i = 0; i < 5; i++) {
            vagoes.add(new Vagao(i + 1, (i + 1) * 10000));
        }
    }

    public GaragemVagoes() {
        vagoes = new ArrayList<>(MAX_VAGOES);
        carregaVagoes();
    }

    public boolean entraVagao(Vagao vagao) {
        if(vagoes.size() == MAX_VAGOES) {
            return false;
        }
        vagoes.add(vagao);
        return true;
    }

    public Vagao saiVagao(int id) {
        for(int i = 0; i < vagoes.size(); i++) {
            if(vagoes.get(i).getId() == id) {
                return vagoes.remove(i);
            }
        }
        return null;
    }

    public Vagao getVagao(int id) {
        for(int i = 0; i < vagoes.size(); i++) {
            if(vagoes.get(i).getId() == id) {
                return vagoes.get(i);
            }
        }
        return null;
    }

    public int getQtdadeVagoes() {
        return vagoes.size();
    }

   


}
