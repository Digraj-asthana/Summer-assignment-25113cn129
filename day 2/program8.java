import java.util.*;
class program8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n, rev=0, rem,temp;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        temp=n;     
        while (n>0) 
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if (rev==temp)
        {
            System.out.println("The number is a palindrome");
        }
        else
        {
            System.out.println("The number is not a palindrome");
        }
    }
}
