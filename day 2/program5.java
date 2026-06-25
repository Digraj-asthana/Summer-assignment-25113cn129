import java.util.*;
class program5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, sum=0, rem;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        while (n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("The sum of digits in n is "+sum);
    }
}
