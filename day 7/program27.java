import java.util.*;
class program27
{
    public static void recursivesumofdigits(int n,int sum)
    {
        if(n==0)
        {
          System.out.println("Sum of digits is "+sum);  
          return;  
        }
        else
        {
            int r=n%10;
            sum=sum+r;
            recursivesumofdigits(n/10,sum);
        }
     }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        recursivesumofdigits(n,sum);
    }
}