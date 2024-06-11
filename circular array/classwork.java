import java.util.Arrays;

public class RotateArray {

    public static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        
        d = d % n;
        
        
        int[] rotatedArray = new int[n];
        
        
        for (int i = 0; i < n; i++) {
            rotatedArray[i] = a[(i + d) % n];
        }
        
        return rotatedArray;
    }

    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int d = 2; 
        
        int[] rotatedArray = rotLeft(array, d);
       
        System.out.println(Arrays.toString(rotatedArray));
    }
}
