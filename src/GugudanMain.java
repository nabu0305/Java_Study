import java.util.Scanner;
public class GugudanMain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String LineValue = scanner.nextLine();
        String[] SplitValue = LineValue.split(",");
        int first = Integer.parseInt(SplitValue[0]);
        int second = Integer.parseInt(SplitValue[1]);
        for(int i=2;i<=first;i++){
            int[] result = gugudan.calculate(i,second);
            gugudan.print(result);
        }
    }
}