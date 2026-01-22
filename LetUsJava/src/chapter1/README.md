# Chapter 1
## An overview of JAVA

Contents:
- [The Evolution of Java](#the-evolution-of-java)
- [The Birth of Java](#the-birth-of-java)
- [What is Java?](#what-is-java)
- [Traditional vs Modern Programming Languages](#traditional-vs-modern-programming-languages)
- [How is Java different?](#how-is-java-different)
- [How Java addresses Security](#how-java-addresses-security)
- [Java or C++?](#java-or-c)
- [The Java Environment](#the-java-environment)
- [Tool or the Trade](#tool-or-the-trade)
- [Summary](#summary)

### The Evolution of Java

Java began in the early 1990s at Sun Microsystems. It was created by James Gosling and his team. At first, it was called "Oak". In 1995, it was renamed "Java" and released to the public.

Java's big idea was to write code once and run it anywhere. That worked by compiling Java to bytecode and running that bytecode on the Java Virtual Machine (JVM). Over the years Java added features like improved libraries, better performance, and support for modern programming ideas.

### The Birth of Java

Java was made because people needed a simple, safe, and portable language for devices and networks. The team wanted a language that worked on different computers without change. The idea of the JVM made this possible.

Java was also meant to be easy to use for building networked programs like applets and web servers.

### What is Java?

Java is a high-level programming language. It is object-oriented, which means programs are made from objects that have data and actions. Java code is compiled into bytecode. The JVM reads and runs that bytecode.

Key points:
- Platform independent: same code runs on different systems if a JVM is present.
- Strong standard library: many ready-made tools and functions.
- Automatic memory management (garbage collection): the system frees unused memory.

### Traditional vs Modern Programming Languages

Traditional languages like C are close to the machine. They give you more control, but you must manage memory and low-level details.

Modern languages like Java focus on making programming safer and faster to write. They add features such as:
- Automatic memory management
- Built-in libraries for many tasks
- Easier-to-read code using objects and classes

This trade-off means modern languages are often slower than low-level ones, but easier and safer for most applications.

### How is Java different?

Java has several features that make it different from some older languages:
- Bytecode + JVM: Java programs run on a virtual machine, making them portable.
- No manual memory free: garbage collector handles memory.
- No raw pointers: reduces many common bugs.
- Rich standard library: lots of ready code for input, networking, GUI, and more.
- Built-in support for multithreading.

### How Java addresses Security

Java was built with security in mind. Some ways Java helps keep programs safe:
- Bytecode verifier: checks code before it runs to stop some bad actions.
- Classloader: controls where code comes from and isolates it.
- Access modifiers (public, private, protected): control what parts of code can be used.
- Managed memory: avoiding raw pointers reduces memory-related attacks.
- (Older) SecurityManager and sandboxing: let systems limit what code can do.

These features make Java a good choice for running untrusted or networked code.

### Java or C++?

Both languages are powerful but different.

Java is easier for most programmers. It manages memory, has fewer low-level details, and includes a big standard library. It is a good choice for web servers, business apps, and Android apps.

C++ gives more control over hardware and memory. It can be faster and is used for games, operating systems, and high-performance apps. But it is harder to learn and more error-prone.

Choose Java when you want safety and portability. Choose C++ when you need maximum speed and control.

### The Java Environment

There are three main parts to know:
- JDK (Java Development Kit): tools for writing and compiling Java code (for example `javac`).
- JRE (Java Runtime Environment): the tools needed to run Java programs (contains the JVM).
- JVM (Java Virtual Machine): runs Java bytecode on a computer.

Common tools:
- `javac`: Java compiler that turns .java files into .class (bytecode).
- `java`: runs the compiled bytecode on the JVM.
- `jar`: packages compiled classes into a single file.

You usually also use an IDE like IntelliJ IDEA, Eclipse, or VS Code to make writing code easier.

### Tool or the Trade

Tools are helpful. They save time and reduce simple mistakes. Examples: IDEs, debuggers, and build tools (Maven, Gradle).

But skill matters more. Knowing how to think about problems, design programs, and test code is the real trade. Tools help you do that work faster, but they do not replace learning.

### Summary

Java is a simple, safe, and portable language that runs on many devices thanks to the JVM. It is good for building networked and large applications. Use the tools to work faster, but spend time learning the basics of programming too.
