package goldFarmer.tasks;

import org.powerbot.script.rt4.Item;

import goldFarmer.cons;
import util.BlackDragonContext;
import util.BlackDragonTask;

public class FightingTask extends BlackDragonTask<BlackDragonContext> {
  
	public FightingTask(BlackDragonContext ctx){
		super(ctx);
	}
  
	@Override
	public boolean activate() {
		return (cons.LUMMY_CITY_AREA.contains(ctx.players.local()) &&
        		(ctx.inventory.select().count() == 18 || ctx.inventory.select().count() == 17));
	}
	@Override
	public void execute() {
		for (Item i : ctx.inventory.items()) {
			i.interact("Drop");
		}
	}
}