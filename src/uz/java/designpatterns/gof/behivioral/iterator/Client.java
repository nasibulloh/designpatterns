package uz.java.designpatterns.gof.behivioral.iterator;

// Client code
public class Client {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.addBook(new Book("Book 1"));
        bookShelf.addBook(new Book("Book 2"));
        bookShelf.addBook(new Book("Book 3"));

        Iterator<Book> iterator = bookShelf.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book title: " + book.getTitle());
        }
    }
}