package uz.java.designpatterns.gof.behivioral.iterator;

// Concrete Iterator
class BookIterator implements Iterator<Book> {
    private final Book[] books;
    private int currentIndex = 0;

    public BookIterator(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < books.length;
    }

    @Override
    public Book next() {
        if (hasNext()) {
            return books[currentIndex++];
        }
        return null;
    }
}
