import java.util.Scanner;

public class Q7_Palindrome {

    public static boolean palindrome1(
            String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) !=
                    text.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static boolean palindrome2(
            String text,
            int start,
            int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) !=
                text.charAt(end))
            return false;

        return palindrome2(
                text,
                start + 1,
                end - 1);
    }

    public static char[] reverse(
            String text) {

        char[] arr =
                new char[text.length()];

        int index = 0;

        for (int i = text.length() - 1;
             i >= 0;
             i--) {

            arr[index++] =
                    text.charAt(i);
        }

        return arr;
    }

    public static boolean palindrome3(
            String text) {

        char[] original =
                text.toCharArray();

        char[] reverse =
                reverse(text);

        for (int i = 0;
             i < original.length;
             i++) {

            if (original[i] != reverse[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");

        String text = sc.nextLine();

        System.out.println(
                "Logic1 : " +
                palindrome1(text));

        System.out.println(
                "Logic2 : " +
                palindrome2(
                        text,
                        0,
                        text.length()-1));

        System.out.println(
                "Logic3 : " +
                palindrome3(text));
    }
}
# =========================
# Q8_Anagram.java
# =========================

cat > Q8_Anagram.java << 'EOF'
import java.util.Scanner;

public class Q8_Anagram {

    public static boolean isAnagram(
            String text1,
            String text2) {

        if (text1.length() != text2.length())
            return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter Second Text: ");
        String text2 = sc.nextLine();

        if (isAnagram(text1, text2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
