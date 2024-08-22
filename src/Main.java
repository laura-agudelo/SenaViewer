import edu.misena.senaviewer.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    // Listas para almacenar el contenido
    private static List<Movie> movies = new ArrayList<>();
    private static List<Serie> series = new ArrayList<>();
    private static List<Book> books = new ArrayList<>();
    private static List<Magazine> magazines = new ArrayList<>();

    public static void main(String[] args) {
        initData();

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
        System.out.println("Movies:");
        for (Movie movie : movies) {
            System.out.println("Year: " + movie.getYear() + " | Title: " + movie.getTitle() + " | Genre: " + movie.getGenre());
        }
    }

    private static void showSeries() {
        System.out.println("Series:");
        for (Serie serie : series) {
            System.out.println("Year: " + serie.getYear() + " | Title: " + serie.getTitle() + " | Genre: " + serie.getGenre());
        }
    }

    private static void showBooks() {
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println("Editorial: " + book.getEditorial() + " | Title: " + book.getTitle() + " | ISBN: " + book.getIsbn());
        }
    }

    private static void showMagazines() {
        System.out.println("Magazines:");
        for (Magazine magazine : magazines) {
            System.out.println("Editorial: " + magazine.getEditorial() + " | Title: " + magazine.getTitle());
        }
    }

    private static void generateReport() {
        System.out.println("Generating general report...");
        System.out.println("Movies:");
        for (Movie movie : movies) {
            System.out.println("ID: " + movie.getId() + " | Title: " + movie.getTitle() + " | Viewed: " + movie.isViewed());
        }
        System.out.println("Series:");
        for (Serie serie : series) {
            System.out.println("ID: " + serie.getId() + " | Title: " + serie.getTitle() + " | Viewed: " + serie.isViewed());
        }
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println("ID: " + book.getId() + " | Title: " + book.getTitle() + " | Read: " + book.isReaded());
        }
        System.out.println("Magazines:");
        for (Magazine magazine : magazines) {
            System.out.println("ID: " + magazine.getId() + " | Title: " + magazine.getTitle());
        }
    }
    private static void generateReportToday() {
        System.out.println("Generating today's report...");
    }

    private static void initData() {
        // Initial sample data
        movies.add(new Movie("Inception", "Sci-Fi", "Christopher Nolan", 148, 2010));
        movies.add(new Movie("The Matrix", "Sci-Fi", "The Wachowskis", 136, 1999));

        series.add(new Serie("Breaking Bad", "Drama", 47));
        series.add(new Serie("Stranger Things", "Sci-Fi", 50));

        books.add(new Book("1984", "1949-06-08", "Secker & Warburg", "978-0451524935"));
        books.add(new Book("To Kill a Mockingbird", "1960-07-11", "J.B. Lippincott & Co.", "978-0060935467"));

        magazines.add(new Magazine("National Geographic", "2024-08", "National Geographic Society"));
        magazines.add(new Magazine("Time", "2024-08", "Time Inc."));
    }
}
