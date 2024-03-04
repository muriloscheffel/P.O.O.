public class Retangulo {
    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Retangulo(double lado1) {
        this.lado1 = lado1;
    }

    public Retangulo() {
        lado1 = 1;
    }

    public double getLado(int n) {
        if (n == 1) {
            return lado1;
        } else {
            return lado2;
        }
    }

    public double area() {
        if (lado2 == 0) {
            return lado1 * lado1;
        } else { 
            return lado1 * lado2;
        }
    }

    public double perimetro() {
        if (lado2 == 0) {
            return 4 * lado1;
        }
        return 2 * (lado1 + lado2);
    }

    @Override
    public String toString() {
        return "Retangulo [lado1=" + lado1 + ", lado2=" + lado2 + "]";
    }
}
