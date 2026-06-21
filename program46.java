import java.util.*;
class program46
{
    public static double armstrong(int a)
    {
        int temp=a,c=0; double arm=0;
        while(temp>0)
        {
            temp/=10;
            c++;
        }
        temp=a;
        while(temp>0)
        {
            arm = arm + (Math.pow(temp%10,c));
            temp/=10;
        }
        return arm;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a =sc.nextInt();
        double arm =armstrong(a);
        if(arm==a)
        {
            System.out.println("The number is an armstrong number");
        }
        else
        {
            System.out.println("the number is not an armstrong number");
        }
    }
}