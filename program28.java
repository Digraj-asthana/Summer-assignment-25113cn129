import java.util.*;
class program28
{
    public static void recursivereverseanumber(int n)
    {
        if(n==0)
        {
          return;  
        }
        else
        {
            int r=n%10;
            System.out.print(r);
            recursivereverseanumber(n/10);
        }
     }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.print("Reverse of the number is: ");
        recursivereverseanumber(n);
    }
}