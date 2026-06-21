import java.util.*;
class program43
{
    public static int prime(int a)
    {
        int c=0;
        for(int i=2;i<=a;i++)
        {
            if(a%i==0)
            {
                c++;
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a =sc.nextInt();
        if(prime(a)==1)
        {
            System.out.println("Number is a prime number");
        }
        else
        {
            System.out.println("Number is not a prime number");
        }
    }
}