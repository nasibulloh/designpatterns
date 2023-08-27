package uz.java.designpatterns.gof.behivioral.iterator;

// Iterator interface
interface Iterator<T> {
    boolean hasNext();
    T next();
}