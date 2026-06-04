import java.util.*;
class program2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }
}