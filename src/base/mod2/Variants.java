package base.mod2;

public enum Variants {
    SCISSORS,
    ROCK,
    PAPER;

    static {
        SCISSORS.setCanWin(PAPER);
        PAPER.setCanWin(ROCK);
        ROCK.setCanWin(SCISSORS);
    }

    private Variants canWin;

    public boolean canWin(Variants canWin) {
        return canWin != null && this.canWin == canWin;
    }

    private void setCanWin(Variants canWin) {
        this.canWin = canWin;
    }
}
