package util;

import java.util.Random;

import org.powerbot.script.Condition;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Component;
import org.powerbot.script.rt4.GameObject;
import org.powerbot.script.rt4.Npc;
import org.powerbot.script.rt4.Game.Tab;

public class ExtraFunc extends ClientAccessor{
	
	//private ClientContext ctx;
	
	public ExtraFunc(ClientContext ctx) { super(ctx); }

	public Random rand = new Random();
	public Walker walker = new Walker(ctx);
    
	// Interacting
	public void interact(GameObject obj, String one) { obj.interact(one); }
	public void interact(GameObject obj, String one, String two) { obj.interact(one, two); }
	public void interactWithBounds(GameObject obj, int[] bounds, String one, String two) { obj.bounds(bounds); obj.interact(one, two); }
	
	//Logout
	public void logout() {
    	Random rand = new Random();
    	Component logout = ctx.widgets.component(182, 12);
		if (!ctx.game.resizable()) {
		    if (logout.visible()) { logout.click(); Condition.sleep(rand.nextInt(50) + 350); }
	    	if ((ctx.game.loggedIn()) && (!ctx.game.tab(Tab.LOGOUT))) { ctx.game.tab(Tab.LOGOUT); }
    	} else {
		    if (logout.visible()) {
		    	logout.click();
		    	Condition.sleep(rand.nextInt(50) + 350);
		    } else {
		    	ctx.game.tab(Tab.LOGOUT);
		    }
		    
    	}
	}
	
	public void moveToNpc(Npc npc) { ctx.movement.step(npc); }
	
	public void walk(Tile[] tilepath) {
		if ((!ctx.players.local().inMotion()) || (ctx.movement.destination().equals(Tile.NIL)) || (ctx.movement.destination().distanceTo(ctx.players.local()) < 5)) {
			walker.walkPath(tilepath);
    	}
	}
	
	public void walkOrTalkToNpc(Tile[] tilepath, Npc npc) {
		if ((!ctx.players.local().inMotion()) || (ctx.movement.destination().equals(Tile.NIL)) || (ctx.movement.destination().distanceTo(ctx.players.local()) < 5)) {
    		if (npc.inViewport()) {
    			npc.interact("Talk-to");
    		}
    		walker.walkPath(tilepath);
    	} 
	}
	
	public void simplewalk(Tile[] tilepath) { walker.walkPath(tilepath); }
	
}

//Sleep.sleepUntil(() -> !LADDER_AREA.contains(myPosition()), 5000, 600);