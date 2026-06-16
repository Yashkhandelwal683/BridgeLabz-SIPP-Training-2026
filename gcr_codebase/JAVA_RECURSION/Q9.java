public class Q9 {
    static void hanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        hanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        hanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }
}
