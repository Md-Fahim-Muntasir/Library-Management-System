package LMS;
import java.util.Scanner;

public class MainMenu {
    int choice;
    public MainMenu(){
        System.out.println("\t\t\t\t\t\t╔══════════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t║                                                                  ║");
        System.out.println("\t\t\t\t\t\t║                    LIBRARY MANAGEMENT SYSTEM                     ║");
        System.out.println("\t\t\t\t\t\t║                                                                  ║");
        System.out.println("\t\t\t\t\t\t╠═════════════════════╦══════════════════╦═════════════════════════╣");
        System.out.println("\t\t\t\t\t\t║                     ║                  ║                         ║");
        System.out.println("\t\t\t\t\t\t║     1.LIBRARIAN     ║     2.MEMBER     ║     3.ADMINISTRATOR     ║");
        System.out.println("\t\t\t\t\t\t║                     ║                  ║                         ║");
        System.out.println("\t\t\t\t\t\t╠═════════════════════╩══════════════════╩═════════════════════════╣");
        System.out.println("\t\t\t\t\t\t║                           4. EXIT                                ║");
        System.out.println("\t\t\t\t\t\t╚══════════════════════════════════════════════════════════════════╝");
        System.out.print("\t\t\t\t\t\tEnter your choice: ");
        
        Scanner ob=new Scanner(System.in);
        choice=ob.nextInt();
        if(choice==1){
            ClearConsole.clear();
            new Admin();
        }else if(choice==2){
            ClearConsole.clear();
            new User();
        }
        else if(choice==3){
            ClearConsole.clear();
            new Administrator();
            
        }
        else if(choice==4){
            ClearConsole.clear();
            ob.close();
            System.exit(0);
            
        }
        else{
            System.out.print("\n\t\t\t\t\t\tInvalid Choice!!!.Try Again...");
            ob.nextLine();
            ob.nextLine();
            ClearConsole.clear();
            new MainMenu();
        }
    }
}
