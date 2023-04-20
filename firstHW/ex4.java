package homework.firstHW;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Operation");
        char op = scanner.next().charAt(0);
        calc(num1, num2, op); 

    }
    static void calc(int n1,int n2, char o){
        switch (o) {
            case '+':
            System.out.println(Math.addExact(n1, n2));
            break;
            case '-':
            System.out.println(Math.subtractExact(n1, n2)); 
            break;
            case '*':
            System.out.println(Math.multiplyExact(n1, n2)); 
            break;
            case '/':
            System.out.println(n1/n2);
            break;
        }
    }
}
