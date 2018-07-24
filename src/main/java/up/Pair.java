package up;

import java.util.Objects;

class Pair {
    private final Moves playerMove;
    private final Moves computerMove;

    Pair(Moves playerMove, Moves computerMove) {
        this.playerMove = playerMove;
        this.computerMove = computerMove;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "playerMove=" + playerMove +
                ", computerMove=" + computerMove +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return playerMove == pair.playerMove &&
                computerMove == pair.computerMove;
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerMove, computerMove);
    }
}
