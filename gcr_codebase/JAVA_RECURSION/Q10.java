public class Q10 {
    static void permute(String prefix, String str) {
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            permute(
                prefix + str.charAt(i),
                str.substring(0, i) + str.substring(i + 1)
            );
        }
    }

    public static void main(String[] args) {
        permute("", "ABC");
    }
}
