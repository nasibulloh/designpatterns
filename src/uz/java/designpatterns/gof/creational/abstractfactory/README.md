# Abstract Factory pattern

The Abstract Factory Pattern is a creational design pattern that provides an interface for creating families of related
or dependent objects without specifying their concrete classes. It is used when you want to create a set of related
objects that belong to different families, while ensuring that the objects are compatible and consistent.

Here's a basic explanation of how the Abstract Factory Pattern works:

## Intent:

To provide an interface for creating families of related objects without specifying their concrete classes.

## Components:

1. AbstractFactory: This is the interface that declares factory methods for creating objects from different families.
   Each factory method corresponds to a family of related products.
2. ConcreteFactory: These are the classes that implement the AbstractFactory interface. Each ConcreteFactory is
   responsible
   for creating a family of related products.
3. AbstractProduct: This is the interface or abstract class that declares the methods for the products created by the
   factories.
4. ConcreteProduct: These are the classes that implement the AbstractProduct interface or extend the abstract class.
   They represent the actual objects created by the ConcreteFactory.

