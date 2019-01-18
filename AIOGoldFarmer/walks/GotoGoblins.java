package AIOGoldFarmer.walks;

import org.powerbot.script.Area;
import org.powerbot.script.rt4.ClientContext;

import AIOGoldFarmer.Gcons;
import tutorialIsland.tcons;
import util.Task;

public class GotoGoblins extends Task {
	
    public Gcons cons = new Gcons();
    
    public GotoGoblins(ClientContext ctx) { super(ctx); }

    @Override
    public boolean activate() {
    	Area lummy = Gcons.LUMMY_CITY_AREA;
        return (lummy.contains(ctx.players.local()));
    }

    @Override
    public void execute() {
    	tcons.status = "GotoGoblins";
    	extra.walk(Gcons.BANK_TO_GOBLINS);
    }
}
