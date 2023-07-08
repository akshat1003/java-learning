import java.util.*;
import java.util.ArrayList;
interface client {
    void input();
    void output();

}


public class Interface implements client{

    String name;
    double salary;
    Scanner sc =new Scanner(System.in);
    List<String> names = new ArrayList<>();
    public void input()
    {
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your salary");
        salary = sc.nextDouble();


    }

    public void output() {
        System.out.println("Hey " + name + "! Your Salary is " + salary);
    }

    public static void main(String[] args){
        client x=new Interface();
        x.input();
        x.output();

    }

}