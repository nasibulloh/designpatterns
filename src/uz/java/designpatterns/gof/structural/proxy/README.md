# Proxy Pattern

The Proxy Pattern is a structural design pattern that provides a surrogate or placeholder for another object to
control access to it. It allows you to add an additional layer of indirection to an object, acting as an intermediary
or a representative, controlling access, and providing additional functionality.

Here's a basic explanation of how the Proxy Pattern works:

## Intent:

To provide a surrogate or placeholder for another object to control access to it.

## Components:

1. Subject: This is the interface that both the RealSubject and the Proxy classes implement. It defines the common
   methods
   that the Proxy and RealSubject share.
2. RealSubject: This is the actual object that the Proxy represents and controls access to. It implements the Subject
   interface.
3. Proxy: This is the class that acts as an intermediary between the client and the RealSubject. It implements the
   Subject
   interface and delegates operations to the RealSubject, possibly providing additional behavior.