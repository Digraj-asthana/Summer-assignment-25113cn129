import java.util.*;
class program39
{
    public static void main(String args[])
    {
        int c=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<i+1;j++)
            {
                for(int k =c;k<5;k++)
                {
                    if(j==1)
                    System.out.print(" ");
                }
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println("");
            c++;
        }
    }
}