public class App {
    public static void exibeVeiculosNaGaragem(GaragemFerroviaria g){
        System.out.println("Veiculos disponiveis na garagem:");
        for(int i = 0; i < g.getQtdadeVeiculos(); i++){
            System.out.println((i + 1) + ") " + g.getVeiculo(i));
        }
    }

    public static void exibeTrensNaGaragem(GaragemFerroviaria g) {
        System.out.println("Trens disponiveis na garagem:");
        for(int i = 0; i < g.getQtdadeTrens(); i++) {
            System.out.println((i + 1) + ") " + g.getTrem(i));
        }
    }

    public static void main(String[] args) throws Exception {
        GaragemFerroviaria g = new GaragemFerroviaria();

        // exibeVeiculosNaGaragem(g);

        g.criaTrem(999, (Locomotiva)g.saiVeiculo(1));
        g.desfazTrem(999);
        
        exibeTrensNaGaragem(g);
    }
}
