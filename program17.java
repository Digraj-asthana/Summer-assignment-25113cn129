import java.util.*;
class program17
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int num,per=1;
        System.out.println("enter a number");
        num =sc.nextInt();
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                per=per+i;
            }
        }
        if(num==per)
        {
            System.out.println("it is a perfect number");
        }
        else
        {
            System.out.println("It is not a perfect number");
        }
    }
}