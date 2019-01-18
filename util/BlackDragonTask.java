package util;

import java.util.Random;

import org.powerbot.script.ClientAccessor;

public abstract class BlackDragonTask<C extends BlackDragonContext> extends ClientAccessor<C> {
	protected BlackDragonTask(C ctx){ super(ctx); }
	public abstract boolean activate();
	public abstract void execute();
	public Random rand = new Random();
}