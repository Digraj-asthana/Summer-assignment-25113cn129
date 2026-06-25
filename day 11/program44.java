import java.util.*;
class program44
{
    public static int factorial(int a)
    {
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a =sc.nextInt();
        int fact=factorial(a);
        System.out.println("Factorial of the given number is "+fact);
    }
}