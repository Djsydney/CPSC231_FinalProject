import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        // create a game with specific number of players
        Game game = new Game(numPlayers);

        // start the game
        game.play();

        scanner.close();
    }
}
