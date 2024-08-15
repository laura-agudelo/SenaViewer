import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int option = getOpcion();

            switch (option) {
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    generateReport();
                    break;
                case 6:
                    generateReportToday();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option (0-6).");
            }
        }
    }
    private static void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazines");
        System.out.println("5. Report");
        System.out.println("6. Report Today");
        System.out.println("0. Exit");
    }

    private static int getOpcion() {
        System.out.print("Select an option: ");
        return scanner.nextInt();
    }

    private static void showMovies() {
        System.out.println("Showing movies...");
    }

    private static void showSeries() {
        System.out.println("Showing series...");
    }

    private static void showBooks() {
        System.out.println("Showing books...");
    }

    private static void showMagazines() {
        System.out.println("Showing magazines...");
    }

    private static void generateReport() {
        System.out.println("Generating report...");
    }

    private static void generateReportToday() {
        System.out.println("Generating today's report...");
    }
}
