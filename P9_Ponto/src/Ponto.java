public class Ponto {
    private int x, y;

    public Ponto() {
        x = 0;
        y = 0;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ponto(Ponto p) {
        x = x.getX();
        y = y.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
 
    public static double distancia(Ponto p1, Ponto p2) {
        
    }
}