import java.util.*;
class program6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n, rev=0, rem;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        while (n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("The reverse of n is "+rev);
    }
}