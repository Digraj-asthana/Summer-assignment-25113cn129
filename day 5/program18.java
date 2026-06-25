import java.util.*;
class program18
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter a number");
        num = sc.nextInt();
        int temp = num;
        while(temp>0)
        {
            int n=temp%10;
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            sum = sum+fact;
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println(num+" is a strong number");
        }
        else
        {
            System.out.println(num+" is not a strong number");
        }
    }
}