# Template method pattern

The Template Method Pattern is a behavioral design pattern that defines the structure of an algorithm in a base class
while allowing subclasses to provide specific implementations for certain steps of the algorithm. It's particularly
useful when you want to create a consistent algorithm framework while allowing customization for certain parts of the
algorithm.

Here's a basic explanation of how the Template Method Pattern works:

## Intent:

To define the structure of an algorithm in a base class and let subclasses provide specific implementations for some of
the steps.

## Components:

1. AbstractClass: This is the base class that defines the template method, which is the main algorithm.
   It also contains abstract methods or "hooks" that subclasses can implement to customize specific steps.
2. ConcreteClass: These are the subclasses that inherit from the abstract class. They provide concrete implementations
   for
   the abstract methods or hooks defined in the abstract class.