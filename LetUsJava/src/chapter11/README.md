# Chapter 11 

## Arrays

Contents:

- [What are Arrays](#what-are-arrays)
  - [A Simple Program using Array](#a-simple-program-using-array)
- [More on Arrays](#more-on-arrays)
  - [Array Initialization](#array-initialization)
  - [Array Access](#array-access)
  - [Bounds Checking](#bounds-checking)
  - [Passing Array Elements to a Function](#passing-array-elements-to-a-function)
  - [Passing Array Reference to a Function](#passing-array-reference-to-a-function)
  - [Returning an Array](#returning-an-array)
- [Common Array Operations](#common-array-operations)
- [Array of Objects](#array-of-objects)
- [Multi-Dimensional Arrays](#multi-dimensional-arrays)
  - [Passing and Returning 2-D Array](#passing-and-returning-2-d-array)
- [Jagged Array](#jagged-array)
- [Resizing of Arrays](#resizing-of-arrays)
- [Summary](#summary)


## What are Arrays

An array is a collection of items of the same type stored under a single name. Each item is called an element and has an index (position). Arrays make it easy to store and work with many values.

### A Simple Program using Array

```java
// A simple Java example (plain text):
int[] nums = new int[5]; // create an int array with 5 elements
nums[0] = 10;
nums[1] = 20;
System.out.println(nums[0]); // prints 10
```


## More on Arrays

### Array Initialization

You can initialize an array when you create it:

```java
int[] a = {1, 2, 3, 4};
int[] b = new int[] {5, 6, 7};
```

If you use `new int[5]`, all elements start with default zero for numeric types, `false` for boolean, and `null` for object references.


### Array Access

Access elements by index starting at 0. Use `arr[i]` to read or write the i-th element.

Example:
```java
int x = a[2]; // third element
a[1] = 50;    // set second element
```


### Bounds Checking

Accessing an index outside 0..length-1 throws `ArrayIndexOutOfBoundsException` in Java. Always check the array length before accessing an index.

Example:
```java
if (i >= 0 && i < arr.length) {
  // safe to use arr[i]
}
```


### Passing Array Elements to a Function

When you pass a single element (primitive value) to a function, the function gets a copy of that value.

```java
void changeValue(int x) { x = 999; }
int[] arr = {1};
changeValue(arr[0]);
// arr[0] is still 1
```


### Passing Array Reference to a Function

When you pass the whole array to a function, the function receives a reference to the same array. The function can change elements and the caller will see the changes.

```java
void changeArray(int[] a) { a[0] = 100; }
int[] arr = {1, 2, 3};
changeArray(arr);
// arr[0] is now 100
```


### Returning an Array

A function can return an array. This is often used to build and return results.

```java
int[] makeArray() { return new int[] {5,6,7}; }
int[] res = makeArray();
```


## Common Array Operations

- Traverse: loop over elements using `for` or enhanced `for` (for-each).
- Search: find an element by scanning or use `Arrays.binarySearch` for sorted arrays.
- Sort: `Arrays.sort(arr)` sorts primitive or Comparable arrays.
- Copy: `Arrays.copyOf(arr, newLength)` or `System.arraycopy`.

Example (for-each):
```java
for (int v : arr) {
  System.out.println(v);
}
```


## Array of Objects

You can have arrays that hold objects. The array stores references to objects. You must create objects before using them.

```java
String[] names = new String[3];
names[0] = new String("Alice");
```


## Multi-Dimensional Arrays

Java supports multi-dimensional arrays (arrays of arrays). For a 2-D array:

```java
int[][] matrix = new int[3][4]; // 3 rows, 4 columns
matrix[0][1] = 10;
```

### Passing and Returning 2-D Array

You can pass and return 2-D arrays just like 1-D arrays.

```java
void printMatrix(int[][] m) {
    for (int[] row : m) {
        for (int v : row) 
            System.out.print(v+" ");
        System.out.println();
    } 
}
```


## Jagged Array

A jagged array is an array of arrays where inner arrays can have different lengths.

```java
int[][] jag = new int[3][];
jag[0] = new int[2];
jag[1] = new int[4];
```


## Resizing of Arrays

Java arrays have fixed length. To "resize" create a new array and copy elements.

```java
int[] old = {1,2,3};
int[] bigger = Arrays.copyOf(old, 5); // new length 5, last elements are 0
```


## Summary

- Arrays store many values of the same type under one name.
- They have fixed length; use copy to resize or prefer `ArrayList` for dynamic size.
- For multi-dimensional data use 2-D arrays or jagged arrays depending on needs.
- Remember bounds checking and that passing arrays passes references.