
package O_Exercise1;
import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<>();
    private Object book;

    public void addBook(Book book) {
        book.addBook();
        bookList.add(book);
        System.out.println("Added");
    }

    public void updateBook(String id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                return;
            }
        }
        Book book = new TextBook();
        book.updateBook(id);
        System.out.println("Not found ID: " + id);
    }

    public void deleteBookById(String id) {


        for (Book object : bookList) {
            if (id.equals(object.getBookId())) {
                bookList.remove(object);
                System.out.println("Deleted ID: " + id);
            } else {
                System.out.println("Not found ID: " + id);
            }
        }

    }

    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                return book;
            }
        }
        System.out.println("Not found ID: " + id);
        return null;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Book book : bookList) {
                book.displayBook();

            }
        }
    }
}

