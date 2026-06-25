import java.util.*;
class program20
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int largest=0,count=0;
        for(int i=n-1;i>0;i--)
        {
            count=0;
            if(n%i==0)
            {
                for(int j=1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        count++;
                    }
                }
                    if(count==2)
                    {
                        largest=i;
                        break;
                    }
             }
         }
         System.out.println("The largest prime factor is: " + largest);
     }
 }
