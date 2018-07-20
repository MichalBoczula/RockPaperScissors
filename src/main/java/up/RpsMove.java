package up;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class RpsMove {

    private final Random random = new Random();
    private final Moves[] moves = Moves.values() ;
    private final Map<String, String> mapMoves = new HashMap<>();
    private final WhoWin[] whoWins = WhoWin.values();

    RpsMove() {
        setMoves();
    }

    Moves playerMove(int move){
        return moves[move-1];
    }

    Moves computerMove(){
        return moves[random.nextInt(3)];
    }

    void setMoves(){
        final String rock = String.valueOf(moves[0]);
        final String paper = String.valueOf(moves[1]);
        final String scissors = String.valueOf(moves[2]);

        mapMoves.put(rock+paper, paper);
        mapMoves.put(rock+scissors, rock);
        mapMoves.put(rock+rock, null);
        mapMoves.put(paper+paper, null);
        mapMoves.put(paper+scissors, scissors);
        mapMoves.put(paper+rock, paper);
        mapMoves.put(scissors+paper, scissors);
        mapMoves.put(scissors+scissors, null);
        mapMoves.put(scissors+rock, rock);
    }

    WhoWin givePointForRoundWinner(Moves playerMove, Moves computerMove){
        if(playerMove.equals(computerMove)){
            return whoWins[2];
        } else {
            if(mapMoves.get(String.valueOf(playerMove)+String.valueOf(computerMove))
                    .equals(String.valueOf(playerMove))){
                return whoWins[1];
            } else {
                return whoWins[0];
            }
        }
    }

}
