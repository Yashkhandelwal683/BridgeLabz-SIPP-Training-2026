import java.util.Scanner;

public class Q3_WordLength2D {

    public static int findLength(String text) {

        int count = 0;

        try {

            while (true) {
                text.charAt(count);
                count++;
            }

        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {

        int length = findLength(text);

        int words = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] result = new String[words];

        String current = "";
        int index = 0;

        for (int i = 0; i < length; i++) {

            if (text.charAt(i) == ' ') {

                result[index++] = current;
                current = "";

            } else {

                current += text.charAt(i);
            }
        }

        result[index] = current;

        return result;
    }

    public static String[][] getWordAndLength(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    public static void display(String[][] data) {

        System.out.println("\nWord\tLength");

        for (int i = 0; i < data.length; i++) {

            System.out.println(
                    data[i][0] + "\t" +
                    Integer.parseInt(data[i][1]));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] result = getWordAndLength(words);

        display(result);
    }
}
# =========================
# Q4_ShortestLongestWord.java
# =========================

cat > Q4_ShortestLongestWord.java << 'EOF'
import java.util.Scanner;

public class Q4_ShortestLongestWord {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {

        int words = 1;

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] arr = new String[words];

        String temp = "";
        int index = 0;

        for (int i = 0; i < findLength(text); i++) {

            if (text.charAt(i) == ' ') {
                arr[index++] = temp;
                temp = "";
            } else {
                temp += text.charAt(i);
            }
        }

        arr[index] = temp;

        return arr;
    }

    public static String[][] getWordLength(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    public static int[] shortestLongest(String[][] data) {

        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {

            int len = Integer.parseInt(data[i][1]);

            if (len < min) {
                min = len;
                minIndex = i;
            }

            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] data = getWordLength(words);

        int[] result = shortestLongest(data);

        System.out.println("Shortest Word : " +
                data[result[0]][0]);

        System.out.println("Longest Word : " +
                data[result[1]][0]);
    }
}
