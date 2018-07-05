package rps;

import java.util.Random;

final class RpsComputerMoves {

    private final Random random = new Random();
    private final RpsCapabilities rpsCapabilities = new RpsCapabilities();

    String getMove() {
        return rpsCapabilities.getMoveFromList(randomNumber());
    }

    private int randomNumber(){
        return random.nextInt(3)+1;
    }
}
