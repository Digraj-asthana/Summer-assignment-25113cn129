import java.util.*;
class program21
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int binary=0,base=1;
        while(n>0)
        {
            binary+=n%2*base;
            base=base*10;
            n=n/2;
        }
        System.out.println("Binary number is: " + binary);
    }
}