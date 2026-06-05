import java.util.*;
class program10
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int n, count=0;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        System.out.println("The prime numbers between 1 and n are:");
        for(int i=2;i<=n;i++)
        {
            count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.print(i+" ");
            }
        }
    }
}