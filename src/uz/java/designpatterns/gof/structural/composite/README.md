# Composite Pattern

The Composite Pattern is a structural design pattern that allows you to compose objects into tree structures to
represent part-whole hierarchies. It treats individual objects and compositions of objects uniformly,
allowing clients to work with complex structures of objects in a consistent manner.

Here's a basic explanation of how the Composite Pattern works:

## Intent:

To compose objects into tree structures to represent part-whole hierarchies. Clients can treat individual objects and
compositions of objects uniformly.

## Components:

1. Component: This is the interface or abstract class that declares the common methods for both leaf objects and
   composite objects.
   It defines the interface for all concrete classes in the composition.
2. Leaf: These are the classes that implement the Component interface and represent individual objects in the
   composition.
   They have no children and often implement the operations directly.
3. Composite: These are the classes that implement the Component interface and can have child components.
   They define operations that are specific to composite objects and can aggregate multiple child components.