public class Exer4 {
    private int x;
    private static int y=0;

    public int f1(int val) {
        return(y+Exer4.f2(val));
    }
    
    public static int f2(int val) {
        return(x * val);
    }
    
    public Exer4(int v1,int v2) {
        x = v1;
        y = v2;
    }
    
    public static void main(String args[]) {
        int z = 4; System.out.println(f1(z));
    }    
}