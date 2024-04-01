public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario("ze", 1000.0);
        Tecnico t1 = new Tecnico("jao", 1000.0, 5);
        Professor p1 = new Professor("alves", 1000.0, 22);

        System.out.println(f1);
        System.out.println(t1);
        System.out.println(p1);
    }
}
