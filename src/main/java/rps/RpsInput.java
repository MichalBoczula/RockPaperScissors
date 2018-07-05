package rps;

import java.util.Scanner;

final class RpsInput {

    private Scanner scanner= new Scanner(System.in);

    String getScanner() {
        return scanner.nextLine();
    }

}
