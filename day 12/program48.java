import java.util.*;
class program48
{
    public static int perfect(int a)
    {
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(perfect(a)==a)
        {
            System.out.println("The given number is a perfect number");
        }
        else
        {
            System.out.println("The given number is not a perfect number");
        }
    }
}