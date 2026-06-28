import java.util.*;
class program93 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String str1 = sc.nextLine().trim();
        System.out.println("Enter the string ");
        String str2 = sc.nextLine().trim();

        if (str1.length() != str2.length()) {
            System.out.println("These Strings are not rotation");
            sc.close();
            return;
        }

        String combined = str1+str1;
        if (combined.contains(str2)) {
            System.out.println("These Strings are rotation");
        } else {
            System.out.println("These Strings are not rotation");
        }

        sc.close();
    }
}