package com.pk.completejava.streams;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.BiPredicate;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
public class learnBasics {
    // Before learn about streams, let's learn about Predicate, Consumer, Function, Supplier, UnaryOperator, BinaryOperator, BiPredicate, BiConsumer, BiFunction, etc.
    // Predicate: It is a functional interface which takes an argument and returns a boolean value.
    // Consumer: It is a functional interface which takes an argument and returns nothing.
    // Function: It is a functional interface which takes an argument and returns a value.
    // Supplier: It is a functional interface which takes no argument and returns a value.
    // UnaryOperator: It is a functional interface which takes an argument and returns a value of the same type.
    // BinaryOperator: It is a functional interface which takes two arguments and returns a value of the same type.
    // BiPredicate: It is a functional interface which takes two arguments and returns a boolean value.
    // BiConsumer: It is a functional interface which takes two arguments and returns nothing.
    // BiFunction: It is a functional interface which takes two arguments and returns a value.

    // Method reference: It is a shorthand syntax of a lambda expression to call a method.
    // Constructor reference: It is a shorthand syntax of a lambda expression to call a constructor.
    public static void main(String[] args) {
        // Predicate
        Predicate<Integer> predicate = (num) -> num > 10;
        System.out.println("Using Predicate: ");
        System.out.println(predicate.test(5));

        // Consumer
        Consumer<Integer> consumer = (num) -> System.out.println(num);
        System.out.println("Using Consumer: ");
        consumer.accept(10);

        // Function
        Function<Integer, Integer> function = (num) -> num * num;
        System.out.println("Using Function: ");
        System.out.println(function.apply(5));

        // Supplier
        Supplier<Integer> supplier = () -> 10;
        System.out.println("Using Supplier: ");
        System.out.println(supplier.get());

        // UnaryOperator
        UnaryOperator<Integer> unaryOperator = (num) -> num * num;
        System.out.println("Using UnaryOperator: ");
        System.out.println(unaryOperator.apply(5));

        // BinaryOperator
        BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 + num2;
        System.out.println("Using BinaryOperator: ");
        System.out.println(binaryOperator.apply(5, 10));

        // BiPredicate
        BiPredicate<Integer, Integer> biPredicate = (num1, num2) -> num1 > num2;
        System.out.println("Using BiPredicate: ");
        System.out.println(biPredicate.test(5, 10));

        // BiConsumer
        BiConsumer<Integer, Integer> biConsumer = (num1, num2) -> System.out.println(num1 + num2);
        System.out.println("Using BiConsumer: ");
        biConsumer.accept(5, 10);

        // BiFunction
        BiFunction<Integer, Integer, Integer> biFunction = (num1, num2) -> num1 + num2;
        System.out.println("Using BiFunction: ");
        System.out.println(biFunction.apply(5, 10));

        // Method reference
        System.out.println("Using Method reference: ");
        Consumer<Integer> consumer1 = System.out::println;
        consumer1.accept(10);

        // Constructor reference
        System.out.println("Using Constructor reference: ");
        Supplier<String> supplier1 = String::new;
        System.out.println(supplier1.get());
    }
}
