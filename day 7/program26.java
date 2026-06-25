import java.util.*;
class program26
{
    public static void recursivefabonacci(int n,int a,int b)
    {
        if(n==0)
        {
          return;  
        }
        else
        {
            int c=a+b;
            System.out.print(c+" ");
            recursivefabonacci(n-1,b,c);
        }
     }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a+" "+b+" ");
        recursivefabonacci(n-2,a,b);
    }
}