public class App {
    public static void exibeLocomotivasNaGaragem(GaragemLocomotivas g){
        System.out.println("Locomotivas disponiveis na garagem:");
        for(int i=0;i<g.getQtdadeLocomotivas();i++){
            System.out.println(i+")"+g.getLocomotiva(i));
        }
    }

    public static void exibeVagoesNaGaragem(GaragemVagoes g){
        System.out.println("Vagoes disponiveis na garagem:");
        for(int i=0;i<g.getQtdadeVagoes();i++){
            System.out.println(i+")"+g.getVagao(i));
        }
    }

    public static void main(String[] args) throws Exception {
        GaragemLocomotivas gl = new GaragemLocomotivas();
        GaragemVagoes gv = new GaragemVagoes();

        exibeLocomotivasNaGaragem(gl);
        exibeVagoesNaGaragem(gv);

        Trem trem = new Trem(10,gl.saiLocomotiva(3));
        trem.engataVagao(gv.saiVagao(2));
        trem.engataVagao(gv.saiVagao(3));
        System.out.println("Trem:"+trem);
        
        exibeLocomotivasNaGaragem(gl);
        exibeVagoesNaGaragem(gv);  
    }
}
