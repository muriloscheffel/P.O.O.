public class Retangulo {
    private final double lado1, lado2;

    public Retangulo(double lado1, double lado2) {
        if (lado1 <= 0 || lado2 <= 0) {
            throw new IllegalArgumentException("Lado inválido");
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Retangulo(double lado1) {
        if (lado1 <= 0) {
            throw new IllegalArgumentException("Lado inválido");
        }
        this.lado1 = lado1;
        this.lado2 = lado1;
    }

    public Retangulo() {
        lado1 = 1;
        lado2 = 1;
    }

    public double getLado(int n) {
        if (n < 1 || n > 2 || lado2 == 0) {
            throw new IllegalArgumentException("Lado inválido");
        }
        if (n == 1) {
            return lado1;
        } else {
            return lado2;
        }
    }

    public double area() {
        return lado1 * lado2;
    }

    public double perimetro() {
        return 2 * (lado1 + lado2);  
    }

    @Override
    public String toString() {
        return "Retângulo [Lado 1=" + lado1 + ", Lado2=" + lado2 + "]";
    }
}
