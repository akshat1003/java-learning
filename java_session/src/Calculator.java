import java.util.*;
public class Calculator{
    public static void main(String[] args)
    {
        int a,b;
        System.out.println("Enter the operation you want to perform");

        Scanner sc=new Scanner(System.in);
        String c=sc.nextLine();
        System.out.println("Enter the first number");
        a=sc.nextInt();
        System.out.println("Enter the second number");
        b=sc.nextInt();

        switch(c){
            case "+":
                int d=a+b;
                System.out.println("Result " + d);
                break;
            case "-":
                d =a-b;
                System.out.println("Result " + d);
                break;
            case "*":
                d=a*b;
                System.out.println("Result " + d);
                break;
            case "/":
                double x=(double)a/b;
                System.out.println("Result " + x);
                break;
            default:
                System.out.println("Invalid Operator");

        }
        sc.close();
    }
}