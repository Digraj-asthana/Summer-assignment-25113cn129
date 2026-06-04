import java.util.*;
class program3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,fact=1;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of n is "+fact);  
    }
}