# Mediator pattern

The Mediator Pattern is a behavioral design pattern that defines an object (the mediator) that centralizes communication
and coordination between multiple objects (colleague objects). Instead of objects directly communicating with each
other, they communicate through the mediator, reducing direct dependencies and promoting loose coupling.

Here's a basic explanation of how the Mediator Pattern works:

## Intent:

To define an object that encapsulates how a set of objects interact. It promotes loose coupling by allowing objects to
communicate through a central mediator, rather than directly with each other.

## Components:

1. Mediator: This is the interface or abstract class that defines the methods for communication between colleague
   objects. It maintains references to the colleague objects and coordinates their interactions.
2. Concrete Mediator: This is the class that implements the Mediator interface. It manages and coordinates the
   communication between colleague objects.
3. Colleague: These are the classes that communicate with each other through the mediator. They are not aware of each
   other and only communicate through the mediator