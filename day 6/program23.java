import java.util.*;
class program23
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int binary=0,base=1,count=0;
        while(n>0)
        {
            binary+=n%2*base;
            base=base*10;
            n=n/2;
        }
        while(binary>0)
        {
            if(binary%10==1)
            {
                count++;
            }
            binary=binary/10;
        }
        System.out.println("The set bits of this number is: " + count);
    }
}