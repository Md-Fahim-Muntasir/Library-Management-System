package LMS;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Administrator {
    private Scanner scanner= new Scanner(System.in);
    Terms terms = new Terms();
    public Administrator(){
        AdministratorLogin();
    }
    
    public void AdministratorLogin(){
        System.out.println("\t\t\t\t\t\t╔══════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t║              ADMINISTRATOR LOG IN PORTAL             ║");
        System.out.println("\t\t\t\t\t\t╚══════════════════════════════════════════════════════╝");
        System.out.print("\n\t\t\t\t\t\tEnter ID: ");
        int enteredId = scanner.nextInt();
        System.out.print("\n\t\t\t\t\t\tEnter PIN: ");
        int enteredPin = scanner.nextInt();
        scanner.nextLine();
        if (enteredId == 23215063 && enteredPin == 3123) {
            ClearConsole.clear();
            AdministratorMenu();
        }
        
        else{
            System.out.print("\n\t\t\t\t\t\tInvalid Input !! Press Enter to return...");
           scanner.nextLine();
            ClearConsole.clear();
            new MainMenu();

        }
    }
    
    public void TermsAndConditions(){
        while(true){
            ClearConsole.clear();
            System.out.println("\t\t\t\t\t\t╔════════════════════════════════════════════════╗");
            System.out.println("\t\t\t\t\t\t║                                                ║");
            System.out.println("\t\t\t\t\t\t║               TERMS & CONDITION                ║");
            System.out.println("\t\t\t\t\t\t║                                                ║");
            System.out.println("\t\t\t\t\t\t╠═══════════════════════╦════════════════════════╣");
            System.out.println("\t\t\t\t\t\t║   1. VIEW TERMS       ║    2. ADD NEW TERMS    ║");
            System.out.println("\t\t\t\t\t\t╠═══════════════════════╬════════════════════════╣");
            System.out.println("\t\t\t\t\t\t║   3. REMOVE A TERM    ║    4.UPDATE A TERM     ║");
            System.out.println("\t\t\t\t\t\t╠═══════════════════════╩════════════════════════╣");
            System.out.println("\t\t\t\t\t\t║                    5. BACK                     ║");
            System.out.println("\t\t\t\t\t\t╚════════════════════════════════════════════════╝");
            System.out.print("\t\t\t\t\t\tEnter your choice: ");
                int ch = scanner.nextInt();
                scanner.nextLine(); 
    
                switch (ch) {
                    case 1:
                        terms.displayTerms();
                        System.out.print("\n\t\t\t\t\t\tPress Enter To Return...");
                        scanner.nextLine();
                        break;
                    case 2:
                        ClearConsole.clear();
                        System.out.println("\t\t\t\t\t\t╔══════════════════════════════════════════════════════╗");
                        System.out.println("\t\t\t\t\t\t║                  TERMS & CONDITIONS                  ║");
                        System.out.println("\t\t\t\t\t\t╚══════════════════════════════════════════════════════╝");
                        System.out.print("\n\t\t\t\t\t\tEnter the new term: ");
                        String newTerm = scanner.nextLine();
                        terms.addTerm(newTerm);  
                        break;
                    case 3:
                        terms.displayTerms(); 
                        System.out.print("\n\t\t\t\t\t\tEnter the Serial no of the term to remove: ");
                        int removeIndex = scanner.nextInt() - 1; 
                        terms.removeTerm(removeIndex);  
                        break;
                    case 4:
                        terms.displayTerms();
                        terms.updateTerm();
                        break;
                    case 5:
                        ClearConsole.clear();
                        AdministratorMenu();
                        
                    default:
                        System.out.println("\t\t\t\t\t\tInvalid choice! Please try again.");
                }
            }
    }
    
    public void addAdmin() { 
        System.out.println("\t\t\t\t\t\t╔══════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t║                     ADD LIBRARIAN                    ║");
        System.out.println("\t\t\t\t\t\t╚══════════════════════════════════════════════════════╝");
        scanner.nextLine();
        System.out.print("\t\t\t\t\t\tEnter Name: ");
        String name = scanner.nextLine();
        System.out.print("\t\t\t\t\t\tEnter ID : ");
        int id=scanner.nextInt();
        scanner.nextLine();
        System.out.print("\t\t\t\t\t\tEnter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("\t\t\t\t\t\tEnter Email: ");
        String email = scanner.nextLine();
        System.out.print("\t\t\t\t\t\tEnter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("\t\t\t\t\t\tEnter PIN: ");
        int pin = scanner.nextInt();
        scanner.nextLine();
        File file = new File("Admin.txt");
        boolean isNewFile = !file.exists() || file.length() == 0;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            if (isNewFile) {
                writer.write("Name,ID,Age,Email,Phone,PIN");
                writer.newLine();
            }

            writer.write(name + "," + id + "," + age + "," + email + "," + phone + "," + pin);
            writer.newLine();
            writer.flush();

            //System.out.print("\n\t\t\t\t\t\tAdmin Added Successfully!!! \n\t\t\t\t\t\tId  : "+id+"\n" + //
                                //"\t\t\t\t\t\tPIN : "+pin+"\n\n\t\t\t\t\t\tPress Enter To Return...");
            System.out.print("\n\t\t\t\t\t\tAdmin Added Successfully. Press Enter To Return...");
            scanner.nextLine();
            ClearConsole.clear();
            AdministratorMenu();
        } catch (IOException e) {
            System.out.print("\t\t\t\t\t\tError saving admin data!!! \n\t\t\t\t\t\tPress Enter To Return...");
            scanner.nextLine();
            ClearConsole.clear();
            AdministratorMenu();
        }
    }

    public void AdministratorMenu() {
        int choice;
        System.out.println("\t\t\t\t\t\t╔════════════════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t║                                                ║");
        System.out.println("\t\t\t\t\t\t║               ADMINISTRATOR MENU               ║");
        System.out.println("\t\t\t\t\t\t║                                                ║");
        System.out.println("\t\t\t\t\t\t╠═══════════════════════╦════════════════════════╣");
        System.out.println("\t\t\t\t\t\t║   1. LIBRARIAN LIST   ║   2. MEMBER LIST       ║");
        System.out.println("\t\t\t\t\t\t╠═══════════════════════╬════════════════════════╣");
        System.out.println("\t\t\t\t\t\t║   3. ADD LIBRARIAN    ║   4.TERMS & CONDITION  ║");
        System.out.println("\t\t\t\t\t\t╠═══════════════════════╬════════════════════════╣");
        System.out.println("\t\t\t\t\t\t║   5. ABOUT DEVELOPER  ║   6. LOG OUT           ║");
        System.out.println("\t\t\t\t\t\t╚═══════════════════════╩════════════════════════╝");
        System.out.print("\t\t\t\t\t\tEnter Your Choice: ");
        choice = scanner.nextInt();
        if (choice == 1) {
            ClearConsole.clear();
File file1 = new File("Admin.txt");

System.out.println("\t\t\t\t\t\t╔══════════════════════════════════════════════════════╗");
System.out.println("\t\t\t\t\t\t║                    LIBRARIAN LIST                    ║");
System.out.println("\t\t\t\t\t\t╚══════════════════════════════════════════════════════╝");

if (!file1.exists() || file1.length() == 0) {
    System.out.println("\t\t\t\t\t\tNo Librarian found!");
    System.out.print("\n\t\t\t\t\t\tPress Enter to return...");
    scanner.nextLine(); 
    scanner.nextLine(); 
    ClearConsole.clear();
    AdministratorMenu();
    return;
}

try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
    String line = reader.readLine(); // Skip header

    while ((line = reader.readLine()) != null) {
        String[] parts = line.split(",");
        if (parts.length == 6) {
            String name = parts[0].trim();
            int id = Integer.parseInt(parts[1].trim());
            int age = Integer.parseInt(parts[2].trim());
            String email = parts[3].trim();
            String phone = parts[4].trim();
            int pin = Integer.parseInt(parts[5].trim());

            Person admin = new Admin(name, age, email, phone, id, pin);
            admin.displayInfo();
        } else {
            System.out.println("\t\t\t\t\t\tInvalid data format: " + line);
        }
    }

    System.out.print("\n\t\t\t\t\t\tPress Enter to return...");
    scanner.nextLine();
    scanner.nextLine();
    ClearConsole.clear();
    AdministratorMenu();
} catch (IOException e) {
    System.out.println("\t\t\t\t\t\tError reading admin data! " + e.getMessage());
    scanner.nextLine();
    scanner.nextLine();
    ClearConsole.clear();
    AdministratorMenu();
}
        } else if (choice == 2) {
            ClearConsole.clear();
            File file = new File("User.txt");
        System.out.println("\t\t\t\t\t\t╔══════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t║                      MEMBER LIST                     ║");
        System.out.println("\t\t\t\t\t\t╚══════════════════════════════════════════════════════╝");

        if (!file.exists() || file.length() == 0) {
            System.out.println("\t\t\t\t\t\tNo users found!");
            System.out.print("\n\t\t\t\t\t\tPress Enter to return...");
            scanner.nextLine(); 
            scanner.nextLine(); 
            ClearConsole.clear();
            AdministratorMenu();
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine(); 

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    String name = parts[0].trim();
                    int id = Integer.parseInt(parts[1].trim());
                    int age = Integer.parseInt(parts[2].trim());
                    String email = parts[3].trim();
                    String phone = parts[4].trim();
                    int pin = Integer.parseInt(parts[5].trim());

                    Person user = new User(name, age, email, phone, id, pin);
                    user.displayInfo();
                } else {
                    System.out.println("\t\t\t\t\t\tInvalid data format: " + line);
                }
            }

            System.out.print("\n\t\t\t\t\t\tPress Enter to return...");
            scanner.nextLine();
            scanner.nextLine();
            ClearConsole.clear();
            AdministratorMenu();
        } catch (IOException e) {
            System.out.println("\t\t\t\t\t\tError reading user data! " + e.getMessage());
            scanner.nextLine();
            scanner.nextLine();
            ClearConsole.clear();
            AdministratorMenu();
        }
    }   
        else if (choice == 3){ 
            ClearConsole.clear();
            addAdmin();
        } 
        else if (choice == 4) {
            ClearConsole.clear();
            TermsAndConditions();
        } else if (choice == 5) {
            ClearConsole.clear();
            Developer devTeam = new Developer();
            devTeam.display(scanner);
            AdministratorMenu();
        }else if (choice == 6) {
            ClearConsole.clear();
            new MainMenu();
        }  else {
            System.out.print("\n\t\t\t\t\t\tInvalid Input !! Press Enter to try again...");
           scanner.nextLine();
            ClearConsole.clear();
            AdministratorMenu();
        }
    }
    
}
