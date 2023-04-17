import java.util.Scanner;
public class Prompt{
    
    private final static String PROMPT = "cal> ";
    
    public void runPrompt(){
        
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();
        
        int month = 1;
        int year = 2017;
        
        while(true){
            System.out.println("년도를 입력하세요.");
            System.out.print("YEAR> ");
            year = scanner.nextInt();
            System.out.println("월을 입력하세요.");
            System.out.print("MONTH> ");
            month = scanner.nextInt();
            if(month == -1){
                break;
            }
            if(month > 12)continue;
            
            cal.printCalendar(year,month);
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