import java.util.*;
class program24
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println("Enter the power");
        int n = sc.nextInt();
        int result=1;
        for(int i=1;i<=n;i++)
        {
            result=result*x;
        }
        System.out.println("The result of x to the power n is: " + result);
    }
}