package base.mod2;

import java.util.Random;

public class Player {
    private final Variants choice;
    private final String name;
    private static final Random random = new Random();

    public Player() {
        this.choice = getRandomChoice();
        this.name = "Bob";
    }

    public Player(Variants choice, String name) {
        this.choice = choice;
        this.name = name;
    }

    public static void whoWins(Player player1, Player player2) {
        boolean firstWin = player1.choice.canWin(player2.choice);
        if (firstWin) {
            player1.writeWinMessage();
        } else {
            boolean secondWin = player2.choice.canWin(player1.choice);
            if (secondWin) {
                player2.writeWinMessage();
            } else {
                System.out.println("Ничья");
            }
        }
    }

    private void writeWinMessage() {
        System.out.println("Победил игрок с именем: " + name);
    }

    private Variants getRandomChoice() {
        return Variants.values()[random.nextInt(Variants.values().length)];
    }
}
