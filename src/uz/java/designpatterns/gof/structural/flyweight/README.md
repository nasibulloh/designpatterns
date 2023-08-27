# Flyweight Pattern

The Flyweight Pattern is a structural design pattern that is used to minimize memory usage and improve performance
by sharing common data between multiple objects. It is particularly useful when dealing with a large number of objects
that have similar properties, and much of the data is duplicated across instances. The pattern aims to reduce memory
consumption by reusing shared data and only storing unique data for each object.

## Here's a basic explanation of how the Flyweight Pattern works:

* ### Intent:
  To share objects efficiently by reusing common data and minimizing memory usage.
* ### Components:

1. Flyweight:
   This is the interface or abstract class that defines the shared methods that concrete flyweight objects must
   implement. 
2. ConcreteFlyweight: These are the actual flyweight objects that store intrinsic (shared) state. 
They implement the shared methods defined by the flyweight interface.
3. FlyweightFactory: This is a factory that manages the creation and reuse of flyweight objects.
It ensures that flyweight objects are shared whenever possible to minimize memory usage.