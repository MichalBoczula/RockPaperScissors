package up;

import java.util.Random;

class RpsRandom {
    private final Random random = new Random();

    int getRandomInt() {
        return random.nextInt(3);
    }
}
