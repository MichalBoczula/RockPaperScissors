package rps;

public final class RpsControl {

    final RpsComputerMoves rpsComputerMoves = new RpsComputerMoves();
    final RpsCapabilities rpsCapabilities = new RpsCapabilities();

    public void menu(RpsInput rpsInput){
        System.out.println("Welcome in Rock Paper Scissors game\nPlease input your name");
        String name = rpsInput.getScanner();

        System.out.println("Hello "+name+" Please choose number of won game");
        int win = Integer.parseInt(rpsInput.getScanner());
        rpsInput.setWin(win);

        System.out.println("You play to: "+rpsInput.getWin()+" win game");

        System.out.println("Press n to start new Game or press x to close game");
        String newGame = rpsInput.getScanner();

        if(newGame.toLowerCase().equals("n")){
            game(rpsInput);

            do {
                System.out.println("If you want play next game press n, or press x to close game");
                newGame = rpsInput.getScanner();

                if(newGame.equals("n")){
                    game(rpsInput);
                } else{
                    System.out.println("Game Closed");
                }
            }while(!newGame.equals("x"));

        } else {
            System.out.println("Game Closed");
        }

    }

    private void game(RpsInput rpsInput){
        int playerWins = 0;
        int computerWins = 0;

        do {
            System.out.println("Press 1 to play rock\n2 to play paper\n3 to play scissors\n" +
                    "or press x to close game");
            String p = rpsInput.getScanner().toLowerCase();

            if (p.equals("1") || p.equals("2") || p.equals("3")){
                String move = playerMove(p);
                String compMove = rpsComputerMoves.getMove();

                System.out.println ("You play "+move+" Comp play "+compMove);
                if (!pointControl(move, compMove)){
                    if (playControl(move,compMove)){
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

            if (playerWins == rpsInput.getWin()){
                System.out.println("You win Game!!!");
            } else if (computerWins == rpsInput.getWin()){
                System.out.println("You lose Game!!!");
            }

            System.out.println("Player: "+playerWins+" Computer: "+computerWins);
        }while(playerWins != rpsInput.getWin() && computerWins != rpsInput.getWin());
    }

    private boolean pointControl(String p, String compMove){
        return p.equals(compMove);
    }

    private boolean playControl(String p, String compMove){
        boolean answer = false;

        if(rpsCapabilities.findPair(p, compMove)){
            answer = true;
        }
        return answer;
    }

    private String playerMove(String p){
        return rpsCapabilities.getMoves(Integer.parseInt(p));
    }
}
