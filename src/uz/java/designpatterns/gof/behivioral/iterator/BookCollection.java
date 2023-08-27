package uz.java.designpatterns.gof.behivioral.iterator;

// Aggregate interface
interface BookCollection {
    Iterator<Book> createIterator();
}
