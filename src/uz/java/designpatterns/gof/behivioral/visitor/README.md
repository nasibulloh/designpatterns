# Visitor pattern

The Visitor Pattern is a behavioral design pattern that allows you to add additional behaviors or operations to a
collection of objects without modifying the objects themselves. It separates the algorithms or operations from the
objects they operate on, enabling you to extend the functionality of objects without changing their structure.

Here's a basic explanation of how the Visitor Pattern works:

## Intent:

To define a new operation without changing the classes of the elements on which it operates. It allows adding new
behaviors to elements by externalizing the responsibility of these behaviors.

## Components:

1. Visitor: This is the interface or abstract class that declares the visit methods for different types of elements.
2. ConcreteVisitor: These are the classes that implement the Visitor interface and provide the actual implementation of
   the visit methods.
3. Element: This is the interface or abstract class that declares the accept method, which accepts a visitor.
4. ConcreteElement: These are the classes that implement the Element interface and provide the implementation of the
   accept method.
5. Object Structure: This is a collection of elements that can be visited by visitors. It provides a way for visitors to
   traverse and visit the elements.