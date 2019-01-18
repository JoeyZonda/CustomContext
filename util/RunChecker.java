package util;

import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;

public class RunChecker extends Task {

	public RunChecker(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
    	return (!ctx.movement.running() && ctx.movement.energyLevel() > (rand.nextInt(10) + 30));
    }

    @Override
    public void execute() {
    	UtilConstants.status = "Run Checker";
        ctx.movement.running(true);
		Condition.sleep(rand.nextInt(150) + 50);
    }
}
