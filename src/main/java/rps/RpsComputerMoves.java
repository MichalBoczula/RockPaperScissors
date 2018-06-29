package rps;

import java.util.Random;

public final class RpsComputerMoves {

    private final Random random = new Random();
    private final RpsCapabilities rpsCapabilities = new RpsCapabilities();

    public String getMove() {
        return rpsCapabilities.getMoves(randomNumber());
    }

    private int randomNumber(){
        return random.nextInt(3)+1;
    }
}
