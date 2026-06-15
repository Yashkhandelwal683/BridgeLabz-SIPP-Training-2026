import java.util.Scanner;

public class Q9_RockPaperScissors {

    public static String computerChoice() {

        int choice =
                (int)(Math.random() * 3);

        if (choice == 0)
            return "Rock";

        if (choice == 1)
            return "Paper";

        return "Scissors";
    }

    public static String winner(
            String user,
            String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock") &&
             computer.equals("Scissors")) ||

            (user.equals("Paper") &&
             computer.equals("Rock")) ||

            (user.equals("Scissors") &&
             computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter Number Of Games: ");

        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        System.out.println(
            "\nGame\tUser\tComputer\tWinner");

        for (int i = 1; i <= games; i++) {

            System.out.print(
                "Enter Choice (Rock/Paper/Scissors): ");

            String user = sc.next();

            String computer =
                    computerChoice();

            String result =
                    winner(user, computer);

            if (result.equals("User"))
                userWins++;

            else if
            (result.equals("Computer"))
                computerWins++;

            System.out.println(
                i + "\t" +
                user + "\t" +
                computer + "\t\t" +
                result);
        }

        double userPercent =
                (userWins * 100.0) / games;

        double computerPercent =
                (computerWins * 100.0) / games;

        System.out.println(
                "\nUser Wins     : " +
                userWins);

        System.out.println(
                "Computer Wins : " +
                computerWins);

        System.out.println(
                "User %        : " +
                userPercent);

        System.out.println(
                "Computer %    : " +
                computerPercent);
    }
}
