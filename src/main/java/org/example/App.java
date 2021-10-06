package org.example;


import java.util.Scanner;

public class App
{
    public static boolean isRetired(int age){
        return age > 64;
    }

    public static double calculate(double num1, double num2, String operator){
        double result = 0;
        switch (operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if(num2 != 0){
                    result = num1 / num2;
                }else {
                    result = 0;
                }
                break;
            default:
                System.out.println("Operator " + operator + " is not supported.");
        }
        return result;
    }

    public static void main( String[] args ) { // Start of main method
        Person basel = new Person();
        basel.firstName = "Basel";
        basel.lastName = "Askar";
        basel.age = 20;
        basel.hobby = "Fishing and Java";
        System.out.println(basel.getSummary());
        System.out.println(basel.getFullName());

    } // End of main method


    public static void simpleCalculationExample(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter a number");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter a operator");
        String operator = scanner.nextLine();


        double result = calculate(num1, num2, operator);
        System.out.println(result);
    }


    public static void selectionExample(){

        int age = 65;

        if(isRetired(age)){
            System.out.println("You are retired");
        }else {
            System.out.println("You are still working");
        }

        if(age > 64){
            System.out.println("You are retired");
        }else{
            System.out.println("You are still working");
        }

    }

    public static void exercise1(){
        System.out.println("Hello World");
    }


}
