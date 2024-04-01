import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CriarArquivoLocomotivas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nomeArquivo = "locomotivas.txt";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            boolean continuar = true;
            while (continuar == true) {
                System.out.println("Digite os dados da locomotiva:");
                System.out.print("Identificador: ");
                int identificador = scanner.nextInt();
                System.out.print("Peso Máximo (toneladas): ");
                double pesoMaximo = scanner.nextDouble();
                System.out.print("Número Máximo de Vagões: ");
                int numMaxVagoes = scanner.nextInt();
                
                bw.write(identificador + "," + pesoMaximo + "," + numMaxVagoes);
                bw.newLine();
                
                System.out.print("Deseja inserir outra locomotiva? (s/n): ");
                String resposta = scanner.next();
                if (resposta.equalsIgnoreCase("n")) {
                    continuar = false;
                }
            }
            System.out.println("Dados das locomotivas foram armazenados em " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro de formato ao ler os dados: " + e.getMessage());
        }
    }
}