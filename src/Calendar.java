import java.util.Scanner;
public class Calendar{
    public static void main(String[] args) {
        int[] Days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("반복횟수를 입력하세요.");
        int num = scanner.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("월을 입력하세요.");
            int month = scanner.nextInt();
            System.out.println(month + "월은" + Days[month] + "일까지 있습니다.");
        }
    }
}