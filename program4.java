import java.util.*;
class program4
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,count=0;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        while (n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("The number of digits in n is "+count);
    }
}