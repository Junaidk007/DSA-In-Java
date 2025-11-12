package assignment;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    } 

    void displayInfo() {
        System.out.println(this.name);
        System.out.println(this.salary);
    }
}

class Calculator {
    static void add(int a, int b){
        System.out.println("the sum of given no. is: "+ (a+b));
    }

    static void add(int a, int b, int c){
        System.out.println("the sum of given no. is: "+ (a+b+c));
    }
}

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
            System.out.println("Title: "+ this.title);
            System.out.println("Author: "+ this.author);
        }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    } 

    Person() {
        System.out.println("Constructor is called");
    }

    void display() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

class PersonPrinter {
    PersonPrinter(Person s) {
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }
}

class Car  {
    String model;
    String color;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void display() {
        System.out.println(this.model);
        System.out.println(this.color);
    }
}

class Animal {
    String name;
    String animalType;

    
    Animal(String name, String animalType) {
        this.name = name;
        this.animalType = animalType;
    }

    void display() {
        System.out.println(this.name);
        System.out.println(this.animalType);
    }
}

public class Main {
    static void greet() {
        System.out.println("Welcome to Java Programming.");
    }
    public static void main(String[] args) {
        greet();
        System.out.println("-------------");
        Main.greet();
    }

    public static Car createCar(String model, String color) {
        return new Car(model, color);
    }
}



