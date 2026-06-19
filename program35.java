import java.util.*;
class program35
{
    public static void main(String args[])
    {
        char ch='A';
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(ch+" ");
            }
            System.out.println(" ");
            ch++;
        }
    }
}