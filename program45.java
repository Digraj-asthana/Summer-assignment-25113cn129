import java.util.*;
class program45
{
    public static int palindrome(int a)
    {
        int temp=a,palin=0;
        while(temp>0)
            {
                palin=palin*10+(temp%10);
                temp=temp/10;
            } 
            return palin;       
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int a =sc.nextInt();
        int palin = palindrome(a);
        if(a==palin)
        {
            System.out.println("The number is a palindrome number");
        }
        else
        {
            System.out.println("The number is not a palindrome number");
        }
    }
}