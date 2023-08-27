# Bridge Pattern

The Bridge Pattern is a structural design pattern that decouples an abstraction from its implementation,
allowing both to vary independently. It separates the abstraction and implementation into separate hierarchies,
enabling you to change and extend them independently without affecting each other.

Here's a basic explanation of how the Bridge Pattern works:

## Intent:

To separate the abstraction from its implementation so that they can vary independently.

## Components:

1. Abstraction: This is the high-level interface that defines the abstract behavior and holds a reference to the
   implementation. It's often an interface or an abstract class.
2. Refined Abstraction: This is a subclass of the Abstraction that further defines or extends its behavior.
3. Implementation: This is the low-level interface that defines the methods that the concrete implementations must
   implement. It's often an interface or an abstract class.
4. Concrete Implementation: These are the classes that implement the Implementation interface. They provide the actual
   implementation details