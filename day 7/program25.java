import java.util.*;
class program25
{
    public static void recursivefactorial(int n,int fact)
    {
        if(n==0)
        {
          System.out.println("Factorial is "+fact);  
          return;
        }
        else
        {
            fact=fact*n;
            recursivefactorial(n-1,fact);
        }
     }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fact = 1;
        recursivefactorial(n,fact);
    }
}