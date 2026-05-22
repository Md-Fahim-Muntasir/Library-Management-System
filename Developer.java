package LMS;
import java.util.*;

public class Developer {
    private final String[][] developers;

    public Developer() {
        // here you can add developers list 
        this.developers = new String[][]{
            {"Md. Fahim Muntasir ", "Lead Developer", "01581773123","fahim9.cse@gmail.com"},
            {"Meher Niger", "Frontend Developer", "01745479680","meher60@gmail.com"}
        };
    }

    public void display(Scanner ob) {
        System.out.println("\t\t\t\t\t\t╔══════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t║                       DEVELOPERS                     ║");
        System.out.println("\t\t\t\t\t\t╚══════════════════════════════════════════════════════╝");
        
        for (String[] dev : developers) {
            System.out.println("\t\t\t\t\t\tName    : " + dev[0]);
            System.out.println("\t\t\t\t\t\tRole    : " + dev[1]);
            System.out.println("\t\t\t\t\t\tContact : " + dev[2]);
            System.out.println("\t\t\t\t\t\tEmail   : " + dev[3]);
            System.out.println("\t\t\t\t\t\t══════════════════════════════════════════════════════════");
        }
        System.out.print("\n\t\t\t\t\t\tPress Enter to return...");
        ob.nextLine();
        ob.nextLine();
        ClearConsole.clear();
        return;
    }
}
