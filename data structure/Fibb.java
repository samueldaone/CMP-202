public class Fibb {
    public static void main(String[] args) {
        int x = 0, y = 1, z;
        System.out.println(x);
        System.out.println(y);
        for (int i = 0; i < 5; i++) {
            z = x+y;
            x = y;
            y = z;
            System.out.println(z);
        }
        
    }
}
