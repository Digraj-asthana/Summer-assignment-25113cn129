import java.util.*;
class program9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, count=0;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("The number is a prime number");
        }
        else
        {
            System.out.println("The number is not a prime number");
        }
    }
}

      