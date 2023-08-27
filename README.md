# LeetCode-DSandAlgo
// Java
// Programming Language

Object Oriented Language


code.java--> code.class
01
bytecode

engine
wheels
staring

Java

Web Applications
Desktop Software
Android

Simple

WORA
Write once and Run Anywhere

1) Platform Independence
2) Object Oriented
3) Security
4) Strongly Typed
5) Garbage Collection

JDK (Java development Kit)
JVM (Java Virtual Machine)
JRE (Java Runtime Env)

OOPS Concept:
1) Inheritance
2) Polymorphism
3) Encapsulation
4) Abstraction (Abstract Classes and Interface)

        int i =10;
        System.out.println(i++); //postfix
        System.out.println(++i); //prefix
//        System.out.println(i++);

char ' '
double 0.0
float 0.0f
boolean false
long > int > short > byte 0

//

Shift Operator

//

int a = (int) doubleValue;




Association ->
It denotes the association of one class with another class

Student class -> Course class
1 Student -> N Courses
1 Course -> N Student

Aggregation ->
It denotes a weaker relationship btw two classes
Employee (Parent)
Address (Child)
Department (Child)

Composition ->
It denotes a stronger relationship btw two classes
Car (Parent)
Engine (Child)

===============================================================

Cardinality
1:1
Car:Engine
1:N
Department:Employees
N:1
Employees:Department
N:N
Student:Courses
===========================



Array
1) WAP to find the minimum and maximum of the array element

Practice Questions
1) Implement a function that reverses the order of elements in an array.
   {1,2,3,4,5} -> {5,4,3,2,1}

2) Write a program to find the second largest element in an array of integers.

{1,2,3,4,5} -> 4

3) Implement a function that removes duplicate elements from an array and returns a new array without duplicates.
   {1,2,2,3,4,4,4,6,5,5} -> {1,2,3,4,6,5}

String
1. Write a program to reverse a given string.
   String str = "madam" -> madam

// Best Time to buy and Sell Stock
//You can only hold at most one

public int maxProfit(int[] prices) {
int maxProfit =0;
for(int i=0;i<arr.length;i++) {
if(arr[i]<arr[i+1]){
maxProfit += arr[i+1]-arr[i];
}
}
return maxProfit;
}



prices [7,6,4,3,1]
20-Aug -> 7
21-Aug -> 6
22-Aug -> 4
23-Aug -> 3
24-Aug -> 1
Max Profit : 0

prices [7,1,5,3,6,4]
20-Aug -> 7
21-Aug -> 1
22-Aug -> 5
23-Aug -> 3
24-Aug -> 6
25-Aug -> 4
Max Profit : 7

prices [1,2,3,4,5]
20-Aug -> 1
21-Aug -> 2
22-Aug -> 3
23-Aug -> 4
24-Aug ->
Max Profit : 4



