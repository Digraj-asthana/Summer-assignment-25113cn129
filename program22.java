import java.util.*;
class program22
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int binary = sc.nextInt();
        int decimal=0,base=1,limit=0;
        while(binary>0)
        {
            limit=binary%10;
            if(limit!=1&&limit!=0)
            {
                System.out.println("Invalid binary number");
                break;
            }
            else
            {
                decimal+=limit*base;
                base=base*2;
                binary=binary/10;
            }
        }
        if(binary==0)
        {
            System.out.println("Decimal number is: " + decimal);
        }
    }
}