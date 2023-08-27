# Iterator pattern

The Iterator Pattern is a behavioral design pattern that provides a way to access the elements of a collection (or
aggregate) sequentially without exposing its underlying representation. It decouples the traversal of elements from the
structure of the collection, allowing clients to iterate over the collection's elements without needing to know how the
elements are stored.

Here's a basic explanation of how the Iterator Pattern works:

## Intent:

To provide a way to access the elements of a collection without exposing its underlying representation.

## Components:

1. Iterator: This is the interface or abstract class that defines the methods for traversing the collection, such as
   next(), hasNext(), etc.
2. Concrete Iterator: This is the class that implements the Iterator interface and provides the actual implementation of
   the traversal methods.
3. Aggregate: This is the interface or abstract class that defines the method for creating an iterator.
4. Concrete Aggregate: This is the class that implements the Aggregate interface and creates an instance of the Concrete
   Iterator