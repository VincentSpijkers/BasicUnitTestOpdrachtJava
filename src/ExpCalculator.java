import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExpCalculator {

    private Map<String, Integer> expModifierTable = new HashMap<>();

    public ExpCalculator(){
        this.expModifierTable.put("League 1", 5);
        this.expModifierTable.put("League 2", 4);
        this.expModifierTable.put("League 3", 2);
        this.expModifierTable.put("League 4", 1);
    }

    public int calculateExp(int baseExp, String playerLeague){
        int leagueModifier = this.expModifierTable.get(playerLeague);
        int adjustedExp = baseExp * leagueModifier;
        return adjustedExp;
    }
}
