# Signleton pattern

The Singleton Pattern is a creational design pattern that ensures a class has only one instance and provides a
global point of access to that instance. It's commonly used when you want to restrict the instantiation of a class to
a single instance and ensure that this instance is shared across the application.

Here's a basic explanation of how the Singleton Pattern works:

## Intent:

To ensure a class has only one instance and provide a global way to access that instance.

## Components:

1. Singleton: This is the class that implements the Singleton Pattern. It typically includes a private static instance
   variable and provides a public static method for accessing the instance.
2. Basically it has 3 types of implementation.

* Eager - create an instance before creation of class. 
* Lazy - create an instance when asked instance of class.
* Threadsafe - 1) Using synchronized method, 2) Double-checked, it means 
inside the synchronized method blocks code checking inside the synchronized block
* Enum singleton(Eager) - It is useful because it is threadsafe , serizalizeable/deserializeable by default, no memory issues

