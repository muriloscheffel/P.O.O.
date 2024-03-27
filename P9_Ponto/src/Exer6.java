public class Exer6 {
    private int x;
    private static int y = 0;
    
    public Exer6(){
        x = 4;
        y++;
    }
    
    public Exer6(int v) {
        x = v;
        y++;
    }
    
    public String toString() { 
        return("x="+x+", y="+y); 
    }
    
    public static void main(String args[]) { 
        new Exer6();
        Exer6 a = new Exer6();
        Exer6 b = new Exer6(5);
        System.out.println(b.toString());
    } 
}