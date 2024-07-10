package newD;
import java.util.Scanner;
class _3Taking_input 
{
public static void main(String[] args) 
{
    try (Scanner scobj = new Scanner(System.in)) {
        System.out.println("enter urname- ");
        String name=scobj.nextLine();
        System.out.println("My name is - "+name);
    }
}    
}
