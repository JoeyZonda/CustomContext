package goldFarmer.tasks;

import java.util.Random;

import org.powerbot.script.Condition;

import util.BlackDragonContext;
import util.BlackDragonTask;
import util.UtilConstants;

public class RunBug extends BlackDragonTask<BlackDragonContext> {

	public RunBug(BlackDragonContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
    	return (!ctx.players.local().inMotion()) && (ctx.movement.destination().distanceTo(ctx.players.local()) < 3);
    }

    @Override
    public void execute() {
    	UtilConstants.status = "Run Bug Fix";
    	Random rand = new Random();

		Condition.sleep(rand.nextInt(150) + 1450);
		
		if ((!ctx.players.local().inMotion()) && (ctx.movement.destination().distanceTo(ctx.players.local()) < 3)) {
			ctx.movement.step(ctx.players.local().tile());
		}
    }
}
