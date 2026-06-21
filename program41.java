import java.util.*;
class program41
{
    public static int sumdigits(int a,int b)
    {
        int sum =a+b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a =sc.nextInt();
        int b= sc.nextInt();
        int sum = sumdigits(a,b);
        System.out.println("The sum of two digits "+sum);
    }
}