import java.util.Scanner;
public class Prompt{
    
    private final static String PROMPT = "cal> ";
    
    public void runPrompt(){
        int[] Days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();
        while(true){
            System.out.println("월을 입력하세요.");
            System.out.print(PROMPT);
            int month = scanner.nextInt();
            if(month == -1){
                break;
            }
            if(month > 12)continue;
            
            cal.printCalendar(2017,month);
        }
        System.out.println("Have a nice day");
        scanner.close();
    }
    
    public static void main(String[] args) {
        Prompt p = new Prompt();
        Scanner scanner = new Scanner(System.in);

        p.runPrompt();
    }
}