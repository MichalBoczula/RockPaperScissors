package up;

class RpsMove {
    private final RpsMoveCapabilities rpsMoveCapabilities = new RpsMoveCapabilities();
    private final Moves[] moves = Moves.values();

    Moves playerMove(int move) {
        return moves[move - 1];
    }

    Moves computerMove(int move) {
        return moves[move];
    }

    WhoWin givePointForRoundWinner(Moves playerMove, Moves computerMove) {
        final Pair localPair = new Pair(playerMove, computerMove);
        return rpsMoveCapabilities.getCapabilitiesMap().get(localPair);
    }
}
