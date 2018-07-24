package up;

import java.util.InputMismatchException;
import java.util.Scanner;

class RpsControl {
    private int howManyRoundWins;
    private final RpsInput rpsInput = new RpsInput();
    private final RpsMove rpsMove = new RpsMove();
    private final RpsRandom rpsRandom = new RpsRandom();

    void startGame() {
        System.out.println("Welcome in Rock Paper Scissors game\nPlease input your name");
        String name = rpsInput.getNextLine();
        boolean isInteger = false;
        while (!isInteger) {
            System.out.println("Hello " + name + " Please choose number of won game");
            try {
                Scanner scanner = new Scanner(System.in);
                this.howManyRoundWins = scanner.nextInt();
                isInteger = true;
            } catch (InputMismatchException e) {
                System.out.println("Please give INTEGER NUMBER!!!");
            }
        }
        System.out.println("You play to: " + howManyRoundWins + " win game");
        System.out.println("Press n to start new Game or press x to close game");
        String playerChoose = rpsInput.getNextLine().toLowerCase();
        if (playerChoose.equals("n")) {
            play();
            do {
                System.out.println("If you want play next game press n, or press x to close game");
                playerChoose = rpsInput.getNextLine().toLowerCase();
                if (playerChoose.equals("n")) {
                    play();
                } else {
                    System.out.println("Game Closed");
                }
            } while (!playerChoose.equals("x"));
        } else {
            System.out.println("Game Closed");
        }
    }

    private void play() {
        int playerWinRound = 0;
        int computerWinRound = 0;
        String playerChoose;
        do {
            System.out.println("Press 1 to play rock\n2 to play paper\n3 to play scissors\n" +
                    "or press x to close game");
            playerChoose = rpsInput.getNextLine().toLowerCase();
            if (playerChoose.equals("1") || playerChoose.equals("2") || playerChoose.equals("3")) {
                Moves playerMove = rpsMove.playerMove(Integer.parseInt(playerChoose));
                Moves computerMove = rpsMove.computerMove(rpsRandom.getRandomInt());
                switch (rpsMove.givePointForRoundWinner(playerMove, computerMove)) {
                    case DRAW:
                        System.out.println("PLAYER play: " + playerMove + " COMPUTER play: " +
                                computerMove + "\nTIE!" +
                                "\nPLAYER: " + playerWinRound + " Computer: " + computerWinRound + "\n");
                        break;
                    case PLAYER:
                        playerWinRound++;
                        System.out.println("PLAYER play: " + playerMove + " COMPUTER play: " +
                                computerMove + "\nPLAYER wins round!" +
                                "\nPLAYER: " + playerWinRound + " Computer: " + computerWinRound + "\n");
                        break;
                    case COMPUTER:
                        computerWinRound++;
                        System.out.println("Player play: " + playerMove + " COMPUTER play: " +
                                computerMove + "\nCOMPUTER wins round!" +
                                "\nPLAYER: " + playerWinRound + " Computer: " + computerWinRound + "\n");
                        break;
                }
            } else if (playerChoose.equals("x")) {
                break;
            }
            if (playerWinRound == howManyRoundWins) {
                System.out.println("PLAYER wins game" +
                        "\nPLAYER: " + playerWinRound + " Computer: " + computerWinRound + "\n");
            } else if (computerWinRound == howManyRoundWins) {
                System.out.println("COMPUTER wins game" +
                        "\nPLAYER: " + playerWinRound + " Computer: " + computerWinRound + "\n");
            }
        } while (playerWinRound != howManyRoundWins && computerWinRound != howManyRoundWins
                && !playerChoose.equals("x"));
    }
}
