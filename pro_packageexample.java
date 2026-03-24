package com.example.myapp;

public class pro_packageexample {
    public static void main(String[] args) {
        System.out.println("Package name: com.example.myapp");
        System.out.println("This class is in a package");
        
        // Using String class from java.lang package (implicit)
        String message = "Hello, World!";
        System.out.println(message);
    }
}

// Note: To compile and run this:
// javac pro_packageexample.java
// java com.example.myapp.pro_packageexample
