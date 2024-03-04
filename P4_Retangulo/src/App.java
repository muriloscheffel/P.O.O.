public class App {
    public static void main(String[] args) throws Exception {
        Retangulo r1 = new Retangulo(3, 4);
        Retangulo r2 = new Retangulo(5);
        Retangulo r3 = new Retangulo();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("-------------------------------");

        System.out.println(r1.area());
        System.out.println(r2.perimetro());
    }
}
