# Facade Pattern

The Facade Pattern is a structural design pattern that provides a unified interface to a set of interfaces in a
subsystem.
It simplifies the interaction between clients and complex systems by providing a higher-level interface that groups
together various subsystem components and hides their complexities.

Here's a basic explanation of how the Facade Pattern works:

## Intent:

To provide a simple, unified interface to a complex subsystem by creating a higher-level interface.

## Components:

1. Facade: This is the class that provides a simplified interface to the complex subsystem. It delegates client requests
   to appropriate subsystem components.
2. Subsystems: These are the classes or modules that represent the individual components of a complex system.
   They are not directly accessible to the client and are used by the facade to fulfill client requests.