import java.util.*;
class program86 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your sentence");
        String sentence = sc.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("It has 0 word");
            sc.close();
            return;
        }

        int count = 1;
        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && (i+1) < sentence.length() && sentence.charAt(i+1) != ' ') {
                count++;
            }
        }

        System.out.println("The number of words is : " + count);

        sc.close();
    }
}