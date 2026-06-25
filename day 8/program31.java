import java.util.*;
class program31
{
    public static void main(String args[])
    {
        int r = 5;

        for (int i = 1; i <= r; i++)
         {
            char ch = 'A'; 
            for (int j = 1; j <= i; j++)
             {
                System.out.print(ch + " ");
                ch++;
            } 
            System.out.println();
         }
    }
}