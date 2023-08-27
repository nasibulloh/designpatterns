# Adapter Pattern

The Adapter Pattern is a structural design pattern that allows objects with incompatible interfaces to work together.
It acts as a bridge between two incompatible interfaces, translating one interface into another. This pattern is
particularly useful when you have legacy code, third-party libraries, or components with different interfaces that need
to work together.

Here's a basic explanation of how the Adapter Pattern works:

## Intent:

To convert the interface of a class into another interface that clients expect. It allows objects with incompatible
interfaces to collaborate.

## Components:

1. Target: This is the interface that the client code expects and interacts with.
2. Adapter: This is the class that implements the Target interface and "adapts" or wraps the Adaptee object.
   It translates requests from the Target interface to the Adaptee interface.
3. Adaptee: This is the class that has the interface incompatible with the Target interface. The Adapter wraps the
   Adaptee to make it compatible with the client's expectations.