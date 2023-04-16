import java.util.Scanner;
public class Calendar{
    public static void main(String[] args) {
        int[] Days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("달을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println(month + "월은" + Days[month] + "일까지 있습니다.");
    }
}