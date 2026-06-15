import java.util.Scanner;

public class Q3_FirstNonRepeating {

    public static char firstNonRepeating(
            String text) {

        int[] freq =
                new int[256];

        for (int i = 0;
             i < text.length();
             i++) {

            freq[text.charAt(i)]++;
        }

        for (int i = 0;
             i < text.length();
             i++) {

            if (freq[text.charAt(i)] == 1)
                return text.charAt(i);
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter Text: ");

        String text =
                sc.nextLine();

        char result =
                firstNonRepeating(text);

        if (result == '\0')
            System.out.println(
                    "No Non-Repeating Character");
        else
            System.out.println(
                    "First Non-Repeating Character: "
                            + result);
    }
}
# =========================
# Q4_CharacterFrequencyASCII.java
# =========================

cat > Q4_CharacterFrequencyASCII.java << 'EOF'
import java.util.Scanner;

public class Q4_CharacterFrequencyASCII {

    public static String[][] frequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int count = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                count++;
        }

        String[][] result = new String[count][2];

        int index = 0;

        for (int i = 0; i < 256; i++) {

            if (freq[i] > 0) {

                result[index][0] =
                        String.valueOf((char)i);

                result[index][1] =
                        String.valueOf(freq[i]);

                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[][] result = frequency(text);

        System.out.println("\nCharacter\tFrequency");

        for (String[] row : result) {
            System.out.println(
                    row[0] + "\t\t" + row[1]);
        }
    }
}
