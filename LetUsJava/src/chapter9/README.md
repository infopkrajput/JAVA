# Chapter 9 

## Introduction to OOP

Contents:

- [The Beginning...](#the-beginning)
- [Structured Programming](#structured-programming)
- [Object-Oriented Programming](#object-oriented-programming)
- [Characteristics of OOP](#characteristics-of-oop)
  - [Objects](#objects)
  - [Classes](#classes)
  - [Inheritance](#inheritance)
  - [Polymorphism](#polymorphism)
  - [Containership](#containership)
  - [Reusability](#reusability)
- [Summary](#summary)


## The Beginning

Computer programs were first written as long lists of instructions executed one by one. As programs grew bigger, people found it hard to manage and change them. This led to better ways of organizing code, such as structured programming and later object-oriented programming (OOP).


## Structured Programming

Structured programming splits a program into small blocks: functions, procedures, and modules. Each block does one task. This made code easier to read and test, but for very large systems it can still be hard to model real-world objects and their relationships.


## Object-Oriented Programming

Object-oriented programming (OOP) models a program as a collection of objects. Each object represents some real-world thing (for example, a Student, a Book, or a BankAccount) and has data (fields) and behavior (methods).

Simple idea in plain English:
- Think in terms of objects instead of only functions.
- Group data and the code that works on that data together in a class.
- Create many objects (instances) from the same class.

Example (plain text):
```java
// A simple idea (not runnable):
class Book {
  String title;
  String author;
  void open() { ... }
}

// Now you can create objects:
Book b = new Book();
```


## Characteristics of OOP

Here are the main features of object-oriented programming with very short, simple explanations.

### Objects

An object is a real-world entity with properties (data) and behaviors (methods). Examples: a Car object has color, speed, and methods like start() and stop().

### Classes

A class is a blueprint for creating objects. It defines what properties and behaviors the objects (instances) will have.

### Inheritance

Inheritance lets a class use properties and methods from another class. It models an "is-a" relationship.

Example (plain text):
```java
class Animal { void eat() { ... } }
class Dog extends Animal { void bark() { ... } }
// Dog inherits eat() from Animal
```

Benefits: code reuse and easier extension.

### Polymorphism

Polymorphism means "many forms" — the same method name can do different things depending on the object that calls it. It lets you write code that works with the parent type but runs the child version of a method.

Example (plain text):
```java
Animal a = new Dog();
a.eat(); // runs Dog's eat if overridden
```

### Containership (Composition)

Containership (also called composition) means a class can contain objects of other classes as fields. It models a "has-a" relationship.

Example (plain text):
```java
class Car { Engine engine; }
// Car has an Engine
```

### Reusability

OOP helps reuse code. Classes and objects can be used again in new programs. Inheritance, composition, and well-designed classes all help with reuse.


## Summary

- OOP models programs as collections of objects built from classes.
- Main benefits: better organization, easier maintenance, and reusability.
- Key ideas: Objects, Classes, Inheritance, Polymorphism, Composition, and Reusability.
