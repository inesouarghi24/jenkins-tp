package com.inesouarghi;


public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b; //  correction  1 : Bug corrigé 
    }

    public int divide(int a, int b) {
        // corection 2 : Vérification ajouté
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed!");
        }
        return a / b;
    }

    //  correction 3 : La méthode "unusedMethod" a été supprimée.

    public int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
}
