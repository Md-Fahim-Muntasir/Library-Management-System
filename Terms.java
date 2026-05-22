package LMS;
import java.util.*;

public class Terms {
    private List<String> terms;
    private Scanner scanner= new Scanner(System.in);

    public Terms() {
        terms = new ArrayList<>();
        terms.add("Users must return borrowed books within the due date.");
        terms.add("Books should be handled with care, damaged books must be replaced.");
        terms.add("Users should not lend borrowed books to others.");
        terms.add("The library reserves the right to update policies at any time.");
    }

    public void displayTerms() {
        ClearConsole.clear();
        System.out.println("\t\t\t\t\t\t╔══════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t\t\t\t║                  TERMS & CONDITIONS                  ║");
        System.out.println("\t\t\t\t\t\t╚══════════════════════════════════════════════════════╝");
        for (int i = 0; i < terms.size(); i++) {
            System.out.println("\t\t\t\t\t\t" + (i + 1) + ". " + terms.get(i));
        }
    }

    public void addTerm(String newTerm) {
        terms.add(newTerm);
        System.out.println("\n\t\t\t\t\t\tTerm added successfully.  Press Enter to return...");
        scanner.nextLine();
        ClearConsole.clear();
        return;
    }

    public void removeTerm(int index) {
        if (index >= 0 && index < terms.size()) {
            terms.remove(index);
            System.out.println("\n\t\t\t\t\t\tTerm removed successfully.  Press Enter to return...");
            scanner.nextLine();
            ClearConsole.clear();
            return;
        } else {
            System.out.println("\n\t\t\t\t\t\tInvalid index. No term removed.  Press Enter to return...");
            scanner.nextLine();
            ClearConsole.clear();
            return;
        }
    }

    public void updateTerm() {
        System.out.print("\n\t\t\t\t\t\tEnter the Serial no of the term to update: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        System.out.print("\n\t\t\t\t\t\tEnter the updated term: ");
        String updatedTerm = scanner.nextLine();
        if (index >= 0 && index < terms.size()) {
            terms.set(index, updatedTerm);
            System.out.println("\n\t\t\t\t\t\tTerm updated successfully.  Press Enter to return...");
            scanner.nextLine();
            ClearConsole.clear();
            return;
        } else {
            System.out.println("\n\t\t\t\t\t\tInvalid index. No term updated.  Press Enter to return...");
            scanner.nextLine();
            ClearConsole.clear();
            return;
        }
    }
}
