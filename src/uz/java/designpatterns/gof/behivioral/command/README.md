# Command pattern

The Command Pattern is a behavioral design pattern that turns a request or simple operation into a standalone object.
This object contains all the information about the request, allowing you to parameterize objects with operations, delay
the execution of an operation, or queue a request for execution. It decouples the sender and receiver of a request and
allows for extensibility in command handling.

Here's a basic explanation of how the Command Pattern works:

## Intent:

To encapsulate a request as an object, thereby allowing for parameterization of clients with different requests, queuing
of requests, or logging of requests, and providing support for undoable operations.

## Components:

1. Command: This is the interface or abstract class that declares a method for executing a command.
2. Concrete Command: These are the classes that implement the Command interface. They encapsulate the receiver of the
   command and the actions to be executed on the receiver.
3. Receiver: This is the class that performs the actual actions associated with the command.
4. Invoker: This is the class that holds a reference to a command and invokes the command's execute() method.