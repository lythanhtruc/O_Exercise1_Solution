
package O_Exercise1;
 import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book {

    private String status;

    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice,
            double quantity, String status) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

    public TextBook() {
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        this.bookId = scanner.nextLine();

        System.out.print("Enter Publisher: ");
        this.publisher = scanner.nextLine();

        System.out.print("Enter Status: ");
        this.status = scanner.nextLine();

        System.out.println("TextBook added successfully.");
    }

    @Override
    public void displayBook() {
        System.out.println(
                "ID: " + bookId
                + ", Publisher: " + publisher
                + ", Status: " + status
        );
    }

}