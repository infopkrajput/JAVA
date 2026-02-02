# Chapter 13 — Inheritance

Contents

- [Uses of Inheritance](#uses-of-inheritance)
- [Constructors in Inheritance](#constructors-in-inheritance)
- [The final Keyword](#the-final-keyword)
- [Incremental Development](#incremental-development)
- [Other Code Reuse Mechanisms](#other-code-reuse-mechanisms)
- [Summary](#summary)


## Uses of Inheritance

Inheritance lets a class (child/subclass) reuse code from another class (parent/superclass). It models an "is-a" relationship.

Main uses in simple words:
- Code reuse: Put common code in a parent class and let many child classes share it.
- Specialization: Child classes add or change behavior (for example, `Dog` extends `Animal` and adds `bark()`).
- Polymorphism: Let code use a parent type while child types provide specific behavior.

Plain example (text):

```java
class Animal {
  void eat() { System.out.println("eating"); }
}
class Dog extends Animal {
  void bark() { System.out.println("barking"); }
}

Animal a = new Dog();
a.eat(); // works and calls Animal's eat (or Dog's override if provided)
```

When to use inheritance:
- Use it when there is a clear "is-a" relationship and you want to share behavior or interface.
- Avoid deep inheritance trees; prefer simple hierarchies.


## Constructors in Inheritance

Constructors are not inherited. When you create a child object, constructors run in this order:
1. Parent class constructor runs first.
2. Child class constructor runs next.

Use `super(...)` to call a specific parent constructor from a child constructor.

Example (text):

```java
class Parent {
  Parent(int x) { ... }
}
class Child extends Parent {
  Child(int x, int y) {
    super(x); // call parent constructor
    // then initialize child fields using y
  }
}
```

Notes:
- If you don't call `super(...)` explicitly, Java will insert `super()` (no-arg) automatically — but only if the parent has a no-arg constructor.
- If the parent has no no-arg constructor, the child must explicitly call a parent constructor.


## The final Keyword

`final` can be used on classes, methods, and variables.

- `final class C {}` — class cannot be extended (no subclasses).
- `final void m() {}` — method cannot be overridden by subclasses.
- `final int x = 5;` — variable cannot be reassigned after initialization.

Why use `final`:
- Prevent inheritance or overriding when it would be unsafe or confusing.
- Make intent clear: some values or behaviors are fixed.


## Incremental Development

When you design with inheritance, build and test in small steps:
1. Write the parent class and test it.
2. Add a simple child class and test it.
3. Add more behavior and test again.

Benefits of incremental development:
- Easier debugging and testing.
- Keeps design flexible: you can change parent behavior early and see effects in children.

Tip: write small examples and unit tests for each class as you add them.


## Other Code Reuse Mechanisms

Inheritance is one way to reuse code, but there are other (often safer) techniques:

- Composition (Containership): A class has fields that are other objects. Use `has-a` relationships instead of `is-a` when appropriate.
  - Example: `Car` has an `Engine` rather than `Car` extends `Engine`.

- Interfaces: Define a set of methods a class must implement. Use interfaces to share behavior without sharing implementation.
  - Example: `interface Drivable { void drive(); }` and many classes implement `Drivable`.

- Delegation: An object forwards work to another helper object.

- Static utility classes: Put common helper functions in a static class (e.g., `Math`).

- Libraries & modules: Reuse code by using tested libraries rather than copying code.

When to prefer composition over inheritance:
- Choose composition when you want to reuse behavior without creating tight coupling between classes.
- Composition is more flexible: you can change the component object at runtime.


## Summary

- Inheritance lets child classes reuse and specialize parent behavior; use it for `is-a` relationships.
- Constructors run parent first then child; use `super(...)` to call specific parent constructors.
- `final` prevents extension, overriding, or reassignment depending on where it is used.
- Use incremental development: add and test small pieces at a time.
- Prefer composition, interfaces, and delegation when deep or awkward inheritance would cause problems.