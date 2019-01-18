package goldFarmer.tasks;

import org.powerbot.script.Condition;
import goldFarmer.cons;

import org.powerbot.script.rt4.Item;

import util.BlackDragonContext;
import util.BlackDragonTask;
import util.UtilConstants;

public class Startup extends BlackDragonTask<BlackDragonContext> {

    public Startup(BlackDragonContext ctx) { super(ctx); }
    
	@Override
    public boolean activate() {
        return (cons.LUMMY_CITY_AREA.contains(ctx.players.local()) &&
        		(ctx.inventory.select().count() == 18 || ctx.inventory.select().count() == 17));
    }

    @Override
    public void execute() {
    	UtilConstants.status = "Startup";
    	
    	//Component yeet = ctx.comaComponents.select(163).text("update").visible();

    	Item BRONZE_SWORD_ITEM = ctx.inventory.select().id(cons.BRONZE_SWORD_ITEM_ID).poll();//.interact("Give");
    	Item WOODEN_SHIELD_ITEM = ctx.inventory.select().id(cons.WOODEN_SHIELD_ITEM_ID).poll();//.interact("Give");
    	
		if (ctx.inventory.select().id(cons.BRONZE_SWORD_ITEM_ID).count() == 1) {
			WOODEN_SHIELD_ITEM.interact("Wield");
			Condition.sleep(rand.nextInt(50) + 250);
		} else if (ctx.inventory.select().id(cons.WOODEN_SHIELD_ITEM_ID).count() == 1) {
			BRONZE_SWORD_ITEM.interact("Wield");
			Condition.sleep(rand.nextInt(50) + 250);
		} else {
			for (Item i : ctx.inventory.items()) {
				i.interact("Drop");
			}
		}
    }
}
