import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        MyList<Caneta> canetas = new MyArrayList<>();

        canetas.add(new Caneta("azul", "bic"));
        canetas.add(new Caneta("preta", "pilot"));
        canetas.add(new Caneta("vermelha", "faber castel"));

        // The worst "for" ever seen for linked lists(O²)
        for(int i = 0; i < canetas.size(); i++) {
            System.out.println(canetas.get(i));
        }
        System.out.println("Percorre a lista usando iterador: ");
        Iterator<Caneta> it = canetas.getIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
