import java.util.*;
class program38
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size");
        int n =sc.nextInt();
        int c =n-1;
        for(int i=2*n-1;i>=1;i-=2)
        {
            for(int j=i;j>=1;j--)
            {
                if(j==i)
                {
                    for(int k=n-1;k>=c;k--)
                    {
                        System.out.print(" ");
                    }
                }
                    System.out.print("*");
            }
                System.out.println("");
                c--;
        }

    }
}