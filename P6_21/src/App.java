public class App {
    public static void main(String[] args) throws Exception {
        Carta c1 = new Carta(Valor.REI, Naipe.ESPADAS);
        System.out.println(c1.getValor());
        System.out.println(c1.getValor().getValor());
    }
}
