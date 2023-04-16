import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        int[] result = new int[10];
        for(int j=2; j < 10; j++) {
            for(int k=1;k<10;k++){
                result[k] = j*k;
                System.out.println(result[k]);
            }
        } 
    }
}