package rps;

final class RpsControl {

    final private RpsComputerMoves rpsComputerMoves = new RpsComputerMoves();
    final private RpsCapabilities rpsCapabilities = new RpsCapabilities();
    private int win = 0;

    void startMenu(){

        final RpsInput rpsInput = new RpsInput();
        System.out.println("Welcome in Rock Paper Scissors game\nPlease input your name");
        String name = rpsInput.getScanner();

        System.out.println("Hello "+name+" Please choose number of won game");
        int win = Integer.parseInt(rpsInput.getScanner());
        setWin(win);

        System.out.println("You play to: "+getWin()+" win game");

        System.out.println("Press n to start new Game or press x to close game");
        String newGame = rpsInput.getScanner();

        if(newGame.toLowerCase().equals("n")){
            startGame();

            do {
                System.out.println("If you want play next game press n, or press x to close game");
                newGame = rpsInput.getScanner();

                if(newGame.equals("n")){
                    startGame();
                } else{
                    System.out.println("Game Closed");
                }
            }while(!newGame.equals("x"));

        } else {
            System.out.println("Game Closed");
        }

    }

    private void startGame(){

        int playerWins = 0;
        int computerWins = 0;
        final RpsInput rpsInput = new RpsInput();

        do {
            System.out.println("Press 1 to play rock\n2 to play paper\n3 to play scissors\n" +
                    "or press x to close game");
            String p = rpsInput.getScanner().toLowerCase();

            if (p.equals("1") || p.equals("2") || p.equals("3")){
                String move = choosePlayerMove(p);
                String compMove = rpsComputerMoves.getMove();

                System.out.println ("You play "+move+" Comp play "+compMove);
                if (!checkIfThereIsADraw(move, compMove)){
                    if (checkPairAndGivePoint(move,compMove)){
                        playerWins++;
                        System.out.println("You win round!");
                    } else {
                        computerWins++;
                        System.out.println("You lose round!");
                    }
                }else {
                    System.out.println("Draw");
                }
            } else if (p.equals("x")){
                System.out.println("Game Closed");
                break;
            }

            if (playerWins == getWin()){
                System.out.println("You win Game!!!");
            } else if (computerWins == getWin()){
                System.out.println("You lose Game!!!");
            }

            System.out.println("Player: "+playerWins+" Computer: "+computerWins);
        }while(playerWins != getWin() && computerWins != getWin());
    }

    private boolean checkIfThereIsADraw(String p, String compMove){
        return p.equals(compMove);
    }

    private boolean checkPairAndGivePoint(String p, String compMove){
        boolean answer = false;

        if(rpsCapabilities.chooseWinnerAndGivePoint(p, compMove)){
            answer = true;
        }
        return answer;
    }

    private String choosePlayerMove(String p){
        return rpsCapabilities.getMoveFromList(Integer.parseInt(p));
    }

    private void setWin(int win){
        this.win = win;
    }

    private int getWin(){
        return win;
    }
}
