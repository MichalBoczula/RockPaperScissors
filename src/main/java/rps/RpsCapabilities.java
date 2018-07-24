package rps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class RpsCapabilities {
    private List<String> moves = new ArrayList<>();
    private Map<String, String> capabilities = new HashMap<>();

    RpsCapabilities() {

        setMovesCapabilities();
        setMovesToList();
    }

    boolean chooseWinnerAndGivePoint(String p, String c){

        boolean answer = false;

        final String key = p+c;
        final String key2 = c+p;

        if (capabilities.containsKey(key) || capabilities.containsKey(key2)){
            if(p.equals(capabilities.get(key)) || p.equals(capabilities.get(key2))){
                answer = true;
            }
        }

        return answer;
    }

    private void setMovesCapabilities(){
        final String rp = "rp";
        final String descRP= "p";
        capabilities.put(rp, descRP);

        final String rs = "rs";
        final String descRS= "r";
        capabilities.put(rs, descRS);

        final  String ps = "ps";
        final String descPS= "s";
        capabilities.put(ps, descPS);
    }

    String getMoveFromList(int number) {
        return moves.get(number-1);
    }

    private void setMovesToList() {
        moves.add("r");
        moves.add("p");
        moves.add("s");
    }

}
