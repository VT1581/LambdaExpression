package com.cg.degreed.lambdaexpressions;

import java.util.Scanner;

//https://capgemini-my.sharepoint.com/personal/onkar_deshpande_capgemini_com/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fonkar%5Fdeshpande%5Fcapgemini%5Fcom%2FDocuments%2FOnkar%20backup%2FCase%20Study%20%26%20Assignment%2FCore%20Java%2FLambda%20expression%20assignments%2Epdf&parent=%2Fpersonal%2Fonkar%5Fdeshpande%5Fcapgemini%5Fcom%2FDocuments%2FOnkar%20backup%2FCase%20Study%20%26%20Assignment%2FCore%20Java&ga=1

//1)write an application to perform basic arithmetic operations like add, subtract,multiply,divide.You need to define a functional interface first.?
public class ArithmeticOperations {
	
	 private static double performOperation(ArithmeticOperationInterface operation, double num1, double num2) {
	        return operation.operations(num1, num2);
	    }
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1=sc.nextInt();
		System.out.println("Enter second number: ");
		int n2=sc.nextInt();
		
		System.out.println("Addition: "+performOperation((a,b)->a+b,n1,n2));
		
		System.out.println("Subtraction: "+performOperation((a,b)->a-b,n1,n2));
		
		System.out.println("Multiplication: "+performOperation((a,b)->a*b,n1,n2));
		
//		System.out.println("Division: "+performOperation((a,b)->a/b,n1,n2));
		
		// Division
        ArithmeticOperationInterface division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Cannot divide by zero!");
                return Double.NaN; // NaN (Not a Number) for an undefined result
            }
        };
        System.out.println("Division: " + performOperation(division, n1, n2));
	}
	
}
