public class App {
    public static void main(String[] args) throws Exception {
        CadFuncionario cf = new CadFuncionario();
        System.out.println(cf);

        System.out.println(cf.qtdadeFuncAtendem(f -> f.isInsalubridade()));
    }
}
