# Chapter 10

## Classes and Objects (continued)

Contents:

- [Classes and Constructors](#classes-and-constructors)
- [Object Destruction](#object-destruction)
- [Terminology](#terminology)
- [A Complex Class](#a-complex-class)
- [The this Reference](#the-this-reference)
- [Static Data and Functions](#static-data-and-functions)
- [Static Block](#static-block)
- [Passing Objects to a Function](#passing-objects-to-a-function)
- [Summary](#summary)


## Classes and Constructors

A class is the blueprint for objects. It defines the data (fields) and the actions (methods) that its objects have.

A constructor is a special method that runs when you create a new object. Constructors usually set initial values for the object's fields.

Plain example (text):

```java
class Point {
  int x, y;              // fields
  // constructor
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

Point p = new Point(2, 3); // constructor runs and sets p.x=2, p.y=3
```

Notes:
- A class can have multiple constructors (different parameters) — this is called constructor overloading.
- If you don't write a constructor, Java gives a default no-argument constructor.


## Object Destruction

Java has automatic memory management (garbage collection). You do not normally destroy objects yourself. When an object is no longer reachable from your program, the garbage collector may free its memory.

Key points:
- Do not rely on finalizers; they are unpredictable. Use try-with-resources or explicit close methods for resources (files, sockets).
- In Java, you free resource handles (close streams) rather than explicitly destroying objects.


## Terminology

Simple quick terms:
- Instance: a single object created from a class.
- Field (or member variable): data stored in an object.
- Method: a function defined in a class.
- Constructor: special method used to create instances.
- Access modifiers: `public`, `private`, `protected` control visibility.


## A Complex Class

A complex class combines fields, constructors, methods, and sometimes inner classes or helper methods. Keep classes focused: one class should represent one concept.

Plain example (text):

```java
class Rectangle {
  double width, height;          // fields
  Rectangle(double w, double h) { // constructor
    width = w; height = h;
  }
  double area() {                // method
    return width * height;
  }
}
```

Tips:
- Keep methods short. If a method grows long, break it into helper methods.
- Use `private` for internal fields and `public` methods to access them (encapsulation).


## The this Reference

`this` is a reference to the current object inside instance methods or constructors. Use `this` when you need to refer clearly to the object's fields or to call another constructor.

Example (text):

```java
class Person {
  String name;
  Person(String name) {
    this.name = name; // 'this.name' is the field, 'name' is the parameter
  }
}
```

Also `this(...)` can call another constructor in the same class (constructor chaining).


## Static Data and Functions

Static fields and methods belong to the class itself, not to individual objects. Use `static` for data or behavior shared by all objects.

Plain example (text):

```java
class Counter {
  static int count = 0;  // shared by all Counter objects
  Counter() { count++; }
  static int getCount() { return count; }
}

Counter a = new Counter();
Counter b = new Counter();
Counter.getCount(); // returns 2
```

Notes:
- Static methods cannot directly use instance fields (they have no `this`).
- Static is useful for utility methods and shared counters/configurations.


## Static Block

A static block runs once when the class is first loaded. Use it to initialize complex static data.

Plain example (text):

```java
class Config {
  static Map<String,String> map;
  static {
    map = new HashMap<>();
    map.put("url", "https://example.com");
  }
}
```

The static block runs before any object of the class is created and before static methods are used.


## Passing Objects to a Function

When you pass an object to a method, you pass the reference to the object (the reference itself is passed by value). This means:
- The method can change the object's fields (the caller sees those changes).
- Reassigning the parameter to a new object inside the method does not change the caller's reference.

Plain example (text):

```java
void changePoint(Point p) {
  p.x = 10;            // caller's Point object is modified
  p = new Point(0, 0); // this reassigns local p only
}
```


## Summary

- Classes group data and behavior. Constructors create objects.
- Java handles memory; prefer explicit resource closing rather than finalizers.
- `this` refers to the current object; `static` members belong to the class.
- Static blocks initialize class-level data. Passing an object passes a reference; methods can modify the object state.


