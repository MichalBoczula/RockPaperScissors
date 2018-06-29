package rps;

import java.util.Scanner;

public final class RpsInput {

    private Scanner scanner= new Scanner(System.in);
    private int win;

    public String getScanner() {
        return scanner.nextLine();
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getWin() {
        return win;
    }
}
