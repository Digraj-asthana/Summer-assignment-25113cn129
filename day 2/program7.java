import java.util.*;
 class program7
 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,prod=1, rem;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        while (n>0)
        {
            rem=n%10;
            prod=prod*rem;
            n=n/10;
        }
        System.out.println("The product of digits in n is "+prod);
    }
 }