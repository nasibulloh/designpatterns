# Interpreter pattern

The Interpreter Pattern is a behavioral design pattern that is used to define a grammar for interpreting a language and
to provide a way to evaluate sentences or expressions in that language. It allows you to build an interpreter that can
parse and interpret complex expressions and sentences in a given language.

Here's a basic explanation of how the Interpreter Pattern works:

## Intent:

To define a grammar for a language and provide an interpreter to evaluate sentences or expressions in that language.

## Components:

1. Abstract Expression: This is the interface or abstract class that declares the interpret method for interpreting
   expressions.
2. Terminal Expression: These are the classes that implement the Abstract Expression interface for representing terminal
   symbols in the grammar. They represent the building blocks of the language.
3. Non-terminal Expression: These are the classes that implement the Abstract Expression interface for representing
   non-terminal symbols in the grammar. They define the rules for interpreting expressions and may contain other
   expressions.
4. Context: This provides information that the interpreter uses to evaluate expressions.