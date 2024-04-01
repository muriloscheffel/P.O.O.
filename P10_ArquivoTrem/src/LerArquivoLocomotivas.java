import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoLocomotivas {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("locomotivas.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                int identificador = Integer.parseInt(dados[0]);
                double pesoMaximo = Double.parseDouble(dados[1]);
                int numMaxVagoes = Integer.parseInt(dados[2]);
                System.out.println("Identificador: " + identificador + ", Peso Máximo: " + pesoMaximo + ", Número Máximo de Vagões: " + numMaxVagoes);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}