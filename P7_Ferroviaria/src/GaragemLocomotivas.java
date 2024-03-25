import java.util.ArrayList;

public class GaragemLocomotivas {
    private static final int MAX_LOCOMOTIVAS = 100;
    private ArrayList<Locomotiva> locomotivas;

    private void carregaLocomotivas() {
        for(int i = 0; i < 5; i++) {
            locomotivas.add(new Locomotiva(i + 1, (i + 1) * 10000, 50));
        }
    }

    public GaragemLocomotivas() {
        locomotivas = new ArrayList<>(MAX_LOCOMOTIVAS);
        carregaLocomotivas();
    }

    public boolean entraLocomotiva(Locomotiva locomotiva) {
        if(locomotivas.size() == MAX_LOCOMOTIVAS) {
            return false;
        }
        locomotivas.add(locomotiva);
        return true;
    }

    public Locomotiva saiLocomotiva(int id) {
        for(int i = 0; i < locomotivas.size(); i++) {
            if(locomotivas.get(i).getId() == id) {
                return locomotivas.remove(i);
            }
        }
        return null;
    }
    
    public Locomotiva getLocomotiva(int id) {
        for(int i = 0; i < locomotivas.size(); i++) {
            if(locomotivas.get(i).getId() == id) {
                return locomotivas.get(i);
            }
        }
        return null;
    }

    public int getQtdadeLocomotivas() {
        return locomotivas.size();
    }
}
