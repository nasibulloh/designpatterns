# State pattern

The State Pattern is a behavioral design pattern that allows an object to change its behavior when its internal state
changes. It encapsulates different behaviors in separate classes, allowing an object to appear as if it changes its
class when its state changes. This pattern is particularly useful when an object's behavior depends on its internal
state, and it needs to transition between different behaviors dynamically.

Here's a basic explanation of how the State Pattern works:

## Intent:

To allow an object to change its behavior when its internal state changes. It encapsulates state-specific behavior in
separate classes and allows the object to change its behavior dynamically.

## Components:

1. Context: This is the class that maintains a reference to the current state object and delegates state-specific
   behavior to the current state.
2. State: This is the interface or abstract class that defines the methods for all state-specific behaviors.
3. Concrete States: These are the classes that implement the State interface. Each concrete state class encapsulates the
   behavior associated with a specific state.