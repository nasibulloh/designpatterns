# Builder pattern

The Builder Pattern is a creational design pattern that separates the construction of a complex object from its
representation, allowing the same construction process to create different representations. It's particularly useful
when dealing with objects that have multiple parts or configurations, and you want to create instances with different
combinations of those parts.

Here's a basic explanation of how the Builder Pattern works:

## Intent:

To separate the construction of a complex object from its representation, allowing different representations to be
created using the same construction process.

## Components:

1. Builder: This is the interface or abstract class that defines the steps for constructing the complex object.
   It includes methods for building each part of the object.
2. ConcreteBuilder: These are the classes that implement the Builder interface. Each ConcreteBuilder is responsible
   for constructing a specific type of complex object.
3. Product: This is the complex object being constructed. It's the end result of the construction process.
4. Director: This is an optional class that guides the construction process using a specific sequence of steps.
   It works with a builder to create the final object.