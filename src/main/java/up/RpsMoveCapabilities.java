package up;

import java.util.HashMap;
import java.util.Map;

class RpsMoveCapabilities {
    private final Map<Pair, WhoWin> capabilitiesMap = new HashMap<>();

    RpsMoveCapabilities() {
        setCapabilitiesMap();
    }

    Map<Pair, WhoWin> getCapabilitiesMap() {
        return capabilitiesMap;
    }

    private void setCapabilitiesMap(){
        capabilitiesMap.put(new Pair(Moves.ROCK, Moves.PAPER), WhoWin.COMPUTER);
        capabilitiesMap.put(new Pair(Moves.ROCK, Moves.SCISSORS), WhoWin.PLAYER);
        capabilitiesMap.put(new Pair(Moves.ROCK, Moves.ROCK), WhoWin.DRAW);
        capabilitiesMap.put(new Pair(Moves.PAPER, Moves.PAPER), WhoWin.DRAW);
        capabilitiesMap.put(new Pair(Moves.PAPER, Moves.SCISSORS), WhoWin.COMPUTER);
        capabilitiesMap.put(new Pair(Moves.PAPER, Moves.ROCK), WhoWin.PLAYER);
        capabilitiesMap.put(new Pair(Moves.SCISSORS, Moves.PAPER), WhoWin.PLAYER);
        capabilitiesMap.put(new Pair(Moves.SCISSORS, Moves.SCISSORS), WhoWin.DRAW);
        capabilitiesMap.put(new Pair(Moves.SCISSORS, Moves.ROCK), WhoWin.COMPUTER);
}
}
