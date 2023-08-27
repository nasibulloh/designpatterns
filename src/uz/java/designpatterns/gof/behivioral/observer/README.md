# Observer pattern

The Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects. When one
object (the subject) changes its state, all its dependents (observers) are notified and updated automatically. This
pattern promotes loose coupling between subjects and observers, allowing them to interact without having direct
knowledge of each other.

Here's a basic explanation of how the Observer Pattern works:

## Intent:

To define a dependency between objects so that when one object changes state, all its dependents are notified and
updated.

## Components:

1. Subject: This is the interface or abstract class that defines the methods for attaching, detaching, and notifying
   observers.
2. Concrete Subject: This is the class that implements the Subject interface. It maintains a list of observers and
   notifies them of state changes.
3. Observer: This is the interface that defines the method for updating when a subject's state changes.
4. Concrete Observer: These are the classes that implement the Observer interface. They register with subjects and
   receive updates when the subject's state changes.