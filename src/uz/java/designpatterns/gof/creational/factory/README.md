# Factory pattern

The Factory Pattern is a creational design pattern that provides an interface for creating objects in a superclass but
allows subclasses to alter the type of objects that will be created. It encapsulates object creation and allows the
client code to interact with the factory interface, abstracting away the specific object creation details.
This pattern promotes loose coupling between the client and the created objects.

Here's a basic explanation of how the Factory Pattern works:

## Intent:

To provide an interface for creating objects and allow subclasses to decide which class to instantiate.

## Components:

1. Creator: This is the superclass or interface that declares the factory method. It may also contain other methods that
   work with the created objects.
2. ConcreteCreator: These are the subclasses that implement the factory method declared in the Creator.
   They are responsible for creating specific instances of objects.
3. Product: These are the objects being created by the factory. The Creator class relies on the factory method to
   create instances of the Product.

