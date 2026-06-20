import java.util.*;
class program40
{
    public static void main(String args[])
    {
        int c=1;
        for(int i=1;i<=5;i++)
        {
            char ch='A';
            for(int j=1;j<i+1;j++)
            {
                for(int k=c;k<5;k++)
                {
                    if(j==1)
                    System.out.print(" ");
                }
                System.out.print(ch);
                ch++;
            }
            ch-=2;
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(ch);
                ch--;
            }
            System.out.println("");
            c++;    
        }
    }
}