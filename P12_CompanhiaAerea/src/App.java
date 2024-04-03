import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate data = LocalDate.now();

        Economica pe = new Economica(data, 1234, 500, 0);

        System.out.println(pe);
    }
}
