package com.inesouarghi;



public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b; // Intentional bug on corrige 
    }

    // LA VOICI : La méthode "divide" qui manquait
    public int divide(int a, int b) {
        return a / b; // No zero division handling
    }

    public void unusedMethod() {
        System.out.println("I serve no purpose!");
    }

    public int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result; 
    }
}
