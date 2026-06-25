import java.util.*;
class program12
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a, b, lcm=0,i;
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        if(a>b)
        {
            for(i=a;i<=a*b;i++)
            {
                if(i%a==0 && i%b==0)
                {
                    lcm = i;
                    break;
                }
            }
        }
        else
        {
            for(i=b;i<=a*b;i++)
            {
                if(i%a==0 && i%b==0)
                {
                    lcm = i;
                    break;
                }
            }
         System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        }
    }
}