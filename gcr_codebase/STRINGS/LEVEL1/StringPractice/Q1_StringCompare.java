import java.util.Scanner;

public class Q1_StringCompare {

    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = sc.next();

        System.out.print("Enter Second String: ");
        String s2 = sc.next();

        boolean custom = compareStrings(s1, s2);
        boolean builtIn = s1.equals(s2);

        System.out.println("Custom Result  : " + custom);
        System.out.println("Built-in Result: " + builtIn);
    }
}
