# Strategy pattern

The Strategy Pattern is a behavioral design pattern that defines a family of interchangeable algorithms or behaviors and
allows clients to choose from them dynamically. It enables selecting an algorithm from a set of alternatives and
encapsulates each algorithm in a separate class, making it easy to switch between different strategies without changing
the client code.

Here's a basic explanation of how the Strategy Pattern works:

## Intent:

To define a family of algorithms, encapsulate each one as a separate class, and make them interchangeable. Clients can
choose the appropriate algorithm dynamically.

## Components:

1. Strategy: This is the interface or abstract class that defines the method(s) for the different strategies or
   algorithms.
2. ConcreteStrategy: These are the classes that implement the Strategy interface, providing different implementations of
   the algorithms.
3. Context: This is the class that maintains a reference to the chosen strategy and uses it to perform operations. The
   context allows clients to switch between different strategies dynamically.