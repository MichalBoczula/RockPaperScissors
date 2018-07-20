package up;

import java.util.Scanner;

class RpsInput {

    private final Scanner scanner = new Scanner(System.in);

    String getNextLine() {
        return scanner.nextLine();
    }
}
