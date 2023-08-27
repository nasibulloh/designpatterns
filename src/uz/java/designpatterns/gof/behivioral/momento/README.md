# Momento pattern

The Memento Pattern is a behavioral design pattern that allows you to capture the internal state of an object without
violating encapsulation and save it in such a way that it can be restored to that state later. It's like taking a
snapshot of an object's state at a particular point in time and being able to revert to that state if needed.

Here's a basic explanation of how the Memento Pattern works:

## Intent:

To capture the internal state of an object and save it externally so that the object can be restored to that state later
without exposing its internal details.

## Components:

1. Originator: This is the class whose state you want to save. It creates a Memento object to capture its state and can
   restore its state from a Memento.
2. Memento: This is the object that stores the state of the Originator. It only allows the Originator to access its
   internal state.
3. Caretaker: This is the class that is responsible for keeping track of Mementos. It can store and retrieve Mementos,
   but it doesn't access or modify their contents.