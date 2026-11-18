/**
 *  1. Documentation Section
 * Progam: Student Management Demonstration
 * Author: Mahi Alam Azad
 * Description: Demonstrate the basic structure of a Java Program
 */

//  2. Package statement
package com.example.demo;

//  3. Import statement
import java.util.Date;

//  4. Interface statement
interface Displayable {
    void displayInfo();
}

// 5. Base class defination
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

// 6. Inheritance statement (extends Person, implements Displayable)
class Student extends Person implements Displayable {
    int rollNumber;

    Student(String name, int rollNumber) {
        super(name);
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}



// 7. Main class definition
public class MainApp {
    int a = 5;

    // Helper mehtod called inside main method
    public static void printTimestamp() {
        System.out.println("Current Timestamp: " + new Date());
    }

    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 12345);
        System.out.println("Value of a: " + a);
        // Display student information
        student.displayInfo();

        // Print current timestamp
        printTimestamp();
    }
}