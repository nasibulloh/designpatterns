# Decorator Pattern

The Decorator Pattern is a structural design pattern that allows behavior to be added to an individual object,
either statically or dynamically, without affecting the behavior of other objects from the same class.
It's useful when you want to extend the functionality of an object without altering its structure.

Here's a basic explanation of how the Decorator Pattern works:

## Intent:

To attach additional responsibilities to objects dynamically, providing a flexible alternative to subclassing.

## Components:

1. Component: This is the interface or abstract class that defines the methods that the concrete components and
   decorators will implement. It represents the base object that can have decorators added to it.
2. ConcreteComponent: This is the class that implements the Component interface. It defines the basic behavior of the
   object that can be decorated.
3. Decorator: This is the abstract class that also implements the Component interface and maintains a reference to
   a Component object. It provides a base for concrete decorators.
4. ConcreteDecorator: These are the classes that extend the Decorator class and add additional behavior or
   responsibilities to the base object. They wrap concrete components and modify their behavior.