package AIOGoldFarmer.walks;

import org.powerbot.script.rt4.ClientContext;
import tutorialIsland.tcons;
import util.Task;

public class GotoBank extends Task {
	
    public GotoBank(ClientContext ctx) { super(ctx); }

    @Override
    public boolean activate() {
        return (ctx.widgets.component(263, 1).component(0).text().contains(tcons.MOVING_ON6_STRING) ||
        		ctx.widgets.component(263, 1).component(0).text().contains(tcons.MOVING_ON7_STRING)) &&
        		(!tcons.BANK_AREA.contains(ctx.players.local()));
    }

    @Override
    public void execute() {
    	tcons.status = "GotoBank";
    	
    	if (tcons.OUTSIDE_BANK_AREA.contains(ctx.players.local())) {
	    	extra.walk(tcons.gotoBank);
    	}
    }
}
