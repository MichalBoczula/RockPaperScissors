package up;

import org.junit.Test;

import static org.junit.Assert.*;

public class RpsMoveTestSuite {

    @Test
    public void playerMove() {
        //Given
        final RpsMove rpsMove = new RpsMove();
        final Moves testRockResult = rpsMove.playerMove(1);
        final Moves testPaperResult = rpsMove.playerMove(2);
        final Moves testScissorsResult = rpsMove.playerMove(3);
        //When & Then
        assertEquals(Moves.ROCK, testRockResult);
        assertEquals(Moves.PAPER, testPaperResult);
        assertEquals(Moves.SCISSORS, testScissorsResult);
    }

    @Test
    public void computerMove(){
        //Given
        final RpsMove rpsMove = new RpsMove();
        final Moves testResultComputerMoveRock = rpsMove.computerMove(0);
        final Moves testResultComputerMovePaper = rpsMove.computerMove(1);
        final Moves testResultComputerMoveScissors = rpsMove.computerMove(2);
        //When & Then
        assertEquals(Moves.ROCK, testResultComputerMoveRock);
        assertEquals(Moves.PAPER, testResultComputerMovePaper);
        assertEquals(Moves.SCISSORS, testResultComputerMoveScissors);
    }

    @Test
    public void givePointForRoundWinner(){
        //Given
        final RpsMove rpsMove = new RpsMove();
        final WhoWin resultRockPaper = rpsMove.givePointForRoundWinner(Moves.ROCK, Moves.PAPER);
        final WhoWin resultRockScissors = rpsMove.givePointForRoundWinner(Moves.ROCK, Moves.SCISSORS);
        final WhoWin resultRockRock = rpsMove.givePointForRoundWinner(Moves.ROCK, Moves.ROCK);
        final WhoWin resultPaperPaper = rpsMove.givePointForRoundWinner(Moves.PAPER, Moves.PAPER);
        final WhoWin resultPaperScissors = rpsMove.givePointForRoundWinner(Moves.PAPER, Moves.SCISSORS);
        final WhoWin resultPaperRock = rpsMove.givePointForRoundWinner(Moves.PAPER, Moves.ROCK);
        final WhoWin resultScissorsPaper = rpsMove.givePointForRoundWinner(Moves.SCISSORS, Moves.PAPER);
        final WhoWin resultScissorsScissors = rpsMove.givePointForRoundWinner(Moves.SCISSORS, Moves.SCISSORS);
        final WhoWin resultScissorsRock = rpsMove.givePointForRoundWinner(Moves.SCISSORS, Moves.ROCK);
        //When & Then
        assertEquals(WhoWin.COMPUTER, resultRockPaper);
        assertEquals(WhoWin.PLAYER, resultRockScissors);
        assertEquals(WhoWin.DRAW, resultRockRock);
        assertEquals(WhoWin.DRAW, resultPaperPaper);
        assertEquals(WhoWin.COMPUTER, resultPaperScissors);
        assertEquals(WhoWin.PLAYER, resultPaperRock);
        assertEquals(WhoWin.PLAYER, resultScissorsPaper);
        assertEquals(WhoWin.DRAW, resultScissorsScissors);
        assertEquals(WhoWin.COMPUTER, resultScissorsRock);
    }
}