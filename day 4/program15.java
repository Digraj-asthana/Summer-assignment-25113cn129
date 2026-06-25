import java.util.*;
class program15
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp=n;
        int count=0,arm=0;
        while (temp>0)
        {
            temp=temp/10;
            count++;
        }
        temp=n;
        while (temp>0)
        {
            arm= arm+(int)Math.pow(temp%10,count);
            temp=temp/10;
        }
        if (arm==n)
        {
            System.out.println(n+" is an armstrong number");
        }
        else
        {
            System.out.println(n+" is not an armstrong number");
        }
    }
}