public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hi");
        String version = System.getProperty("java.version");
        String so = System.getProperty("os.name");
        String sov = System.getProperty("os.version");
        System.out.println("Java version: " + version);
        System.out.println("Sistema operacional: " + so + " " + sov);
    }
}
