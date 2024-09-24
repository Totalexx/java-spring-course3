package base.mod2;

public class Task3 {
    public static void main(String[] args) {
        Player bob = new Player();
        Player alice = new Player(Variants.SCISSORS, "Alise");

        Player.whoWins(bob, alice);
    }
}
