package AIOGoldFarmer.tasks;

import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Item;

import util.Task;
import util.UtilConstants;
import AIOGoldFarmer.Gcons;

public class PreReqs extends Task {
	
    public PreReqs(ClientContext ctx) { super(ctx); }
    
    @Override
    public boolean activate() {
    	return (Gcons.SPAWN_AREA.contains(ctx.players.local()) &&
        		(ctx.inventory.select().count() > 2));
    }

    @Override
    public void execute() {
    	UtilConstants.status = "PreReqs";
    	
    	Item BRONZE_SWORD_ITEM = ctx.inventory.select().id(Gcons.BRONZE_SWORD_ITEM_ID).poll();//.interact("Give");
    	Item WOODEN_SHIELD_ITEM = ctx.inventory.select().id(Gcons.WOODEN_SHIELD_ITEM_ID).poll();//.interact("Give");
    	
		if (ctx.inventory.select().id(Gcons.BRONZE_SWORD_ITEM_ID).count() == 1) {
			BRONZE_SWORD_ITEM.interact("Wield");
			Condition.sleep(rand.nextInt(50) + 550);
		} else if (ctx.inventory.select().id(Gcons.WOODEN_SHIELD_ITEM_ID).count() == 1) {
			WOODEN_SHIELD_ITEM.interact("Wield");
			Condition.sleep(rand.nextInt(50) + 550);
		} else {
			for (Item i : ctx.inventory.items()) {
				if (i.id() != Gcons.BRONZE_PICKAXE_ITEM_ID) {
					i.interact("Drop");
				}
			}
		}
    }
}
