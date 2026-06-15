import java.util.Scanner;

public class Q6_CharacterType {

    public static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch == 'a' || ch == 'e' ||
            ch == 'i' || ch == 'o' ||
            ch == 'u')
            return "Vowel";

        if (ch >= 'a' && ch <= 'z')
            return "Consonant";

        return "Not Letter";
    }

    public static String[][] getCharacterTypes(String text) {

        String[][] data =
                new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {

            data[i][0] =
                    String.valueOf(text.charAt(i));

            data[i][1] =
                    checkCharacter(text.charAt(i));
        }

        return data;
    }

    public static void display(String[][] data) {

        System.out.println("Character\tType");

        for (int i = 0; i < data.length; i++) {

            System.out.println(
                    data[i][0] + "\t\t" +
                    data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[][] result =
                getCharacterTypes(text);

        display(result);
    }
}
# =========================
# Q7_TrimSpaces.java
# =========================

cat > Q7_TrimSpaces.java << 'EOF'
import java.util.Scanner;

public class Q7_TrimSpaces {

    public static int[] trimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < text.length() &&
               text.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 &&
               text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String substringCustom(
            String text,
            int start,
            int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(
            String a,
            String b) {

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) != b.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        int[] indexes = trimIndexes(text);

        String custom =
                substringCustom(
                        text,
                        indexes[0],
                        indexes[1]);

        String builtIn = text.trim();

        System.out.println("Custom  : " + custom);
        System.out.println("BuiltIn : " + builtIn);

        System.out.println(
                "Same? " +
                compareStrings(custom, builtIn));
    }
}
