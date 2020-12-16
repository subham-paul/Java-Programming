package test;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Two numbers: ");
        // nextInt() reads the next int from the keyboard
        int first = reader.nextInt();
        int second = reader.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);
        int result;
        
        switch(operator)
        {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
       
        System.out.printf("%d %c %d = %d", first, operator, second, result);
    }
}