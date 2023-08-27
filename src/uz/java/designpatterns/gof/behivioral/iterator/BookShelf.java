package uz.java.designpatterns.gof.behivioral.iterator;

// Concrete Aggregate (Book Shelf)
class BookShelf implements BookCollection {
    private final Book[] books;
    private int count = 0;

    public BookShelf(int capacity) {
        this.books = new Book[capacity];
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        }
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}
