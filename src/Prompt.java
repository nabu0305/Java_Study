import java.util.Scanner;
public class Prompt{
    
    public int parseDay(String str_weekday){
        if(str_weekday.equals("SU"))return 0;
        else if(str_weekday.equals("MO"))return 1;
        else if(str_weekday.equals("TU"))return 2;
        else if(str_weekday.equals("WE"))return 3;
        else if(str_weekday.equals("TH"))return 4;
        else if(str_weekday.equals("FR"))return 5;
        else if(str_weekday.equals("SA"))return 6;
        else return 0;
    }
    
    public void runPrompt(){
        
        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();
        
        int month = 1;
        int year = 2017;
        int weekday = 0;
        while(true){
            System.out.println("년도를 입력하세요.");
            System.out.print("YEAR> ");
            year = scanner.nextInt();
            if(year == -1){
                break;
            }
            System.out.println("월을 입력하세요.");
            System.out.print("MONTH> ");
            month = scanner.nextInt();

            if(month > 12 || month < 1){
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            
            cal.printCalendar(year,month);
        }
        System.out.println("Have a nice day");
        scanner.close();
    }
    
    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}