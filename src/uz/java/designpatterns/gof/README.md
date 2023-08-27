# GOF Patterns
The "GOF patterns" refers to the design patterns described in the book "Design Patterns: Elements of Reusable
Object-Oriented Software" written by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides, often referred to 
as the "Gang of Four" (GOF). This book introduced 23 classic design patterns that provide solutions to common software 
design problems. These patterns are categorized into three groups: Creational, Structural, and Behavioral.

Here's a brief overview of each category along with a list of the patterns:

## Creational Patterns:
These patterns deal with the process of object creation, providing mechanisms for creating objects in a manner that 
enhances flexibility and reuse.

### Singleton 
Ensure a class has only one instance and provide a global point of access to it.
### Factory Method
Define an interface for creating objects, but allow subclasses to decide which class to instantiate.
### Abstract Factory
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
### Builder
Separate the construction of a complex object from its representation, allowing the same construction process to create different representations.
### Prototype
Create new objects by copying an existing object (prototype) instead of creating them from scratch.


## Structural Patterns:
These patterns deal with the composition of classes or objects to form larger structures, emphasizing how classes and 
objects can be combined to form new structures.

### Adapter
Convert the interface of a class into another interface that clients expect. Also known as the "Wrapper" pattern.
### Bridge
Decouple an abstraction from its implementation, allowing both to vary independently.
### Composite
Compose objects into tree structures to represent part-whole hierarchies.
### Decorator
Attach additional responsibilities to objects dynamically, providing a flexible alternative to subclassing.
### Facade
Provide a unified interface to a set of interfaces in a subsystem, simplifying interaction for clients.
### Flyweight
Use sharing to support large numbers of fine-grained objects efficiently.

## Behavioral Patterns:
These patterns deal with the interactions between objects and how they communicate or collaborate to achieve specific goals.

### Chain of Responsibility
Avoid coupling the sender of a request to its receiver by allowing more than one object to handle the request.
### Command
Encapsulate a request as an object, thereby allowing for parameterization of clients with different requests.
### Interpreter
Provide a way to evaluate language grammar or expressions.
### Iterator
Provide a way to access elements of a collection sequentially without exposing its underlying representation.
### Mediator
Define an object that encapsulates how a set of objects interact, promoting loose coupling.
### Memento
Capture an object's internal state so that it can be restored to that state later.
### Observer
Define a dependency between objects so that when one changes state, all its dependents are notified and updated automatically.
### State
Allow an object to change its behavior when its internal state changes.
### Strategy
Define a family of algorithms, encapsulate each one, and make them interchangeable.
### Template Method
Define the structure of an algorithm in a base class but allow subclasses to override specific steps.
### Visitor
Represent an operation to be performed on elements of an object structure, separating the operation from the elements.


These patterns provide proven solutions to recurring design problems and are widely used in software development to improve code quality, maintainability, and reusability. Each pattern addresses a specific set of concerns and can be applied appropriately based on the design requirements.