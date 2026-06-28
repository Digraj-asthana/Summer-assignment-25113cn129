import java.util.*;
class program94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("This is a empty string");
            sc.close();
            return;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        System.out.println("The compress string is " + compressed);

        sc.close();
    }
}