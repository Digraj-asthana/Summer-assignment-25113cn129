import java.util.*;
class program37
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pyramid");
        int n =sc.nextInt();
        int c=1;
        for (int i=1;i<=((2*n)-1);i+=2)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                {
                for(int k=c;k<=(n-1);k++)
                {
                    System.out.print(" ");
                }
                }
                System.out.print("*");
            }
            System.out.println("");
            c++;
        }
    }
}