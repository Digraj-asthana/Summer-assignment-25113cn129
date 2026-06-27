import java.util.*;
class program81 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String str = sc.nextLine();
        
        int count = 0;
        while (true) {
            try {
                str.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        System.out.println("The given string length is " + count);

        sc.close();
    }
}