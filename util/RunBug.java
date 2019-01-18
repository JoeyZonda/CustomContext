package util;

import java.util.Random;

import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;

public class RunBug extends Task {

	public RunBug(ClientContext ctx) {
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
