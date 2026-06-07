import java.util.*;
class program11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,b,gcd=1;
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        if (a>b)
        {
            for(int i=1;i<=a;i++)
            {
                if (a%i==0 && b%i==0)
                {
                    gcd = i;
                }
            }
        }
        else
        {
            for(int i=1;i<=b;i++)
            {
                if (a%i==0 && b%i==0)
                {
                    gcd = i;
                }
            }
        }
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }
}