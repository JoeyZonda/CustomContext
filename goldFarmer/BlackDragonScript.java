package goldFarmer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import org.powerbot.script.PaintListener;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;

import goldFarmer.tasks.*;
import util.BlackDragonContext;
import util.BlackDragonTask;
import util.UtilConstants;
import util.UI.CMouse;
import util.UI.CMouse.MouseTrail;

@Script.Manifest(name = "BlackDragon", description = "sugma", properties = "author=xxjamyboixx; client=4")
public class BlackDragonScript extends PollingScript<BlackDragonContext> implements PaintListener{

	private BlackDragonTask<BlackDragonContext>[] blackDragonTasks;

	private MouseTrail mouseTrail;
	
	public static long milliseconds, seconds, minutes, hours;
	
    Color mouseC = new Color(UtilConstants.mc1, UtilConstants.mc2, UtilConstants.mc3, 120);
	
	@SuppressWarnings("unchecked")
	@Override
	public void start() {
		mouseTrail = new CMouse.MouseTrail();
		
		new CMouse();
		
		FightingTask fightingTask = new FightingTask(ctx);
		Startup startup = new Startup(ctx);
		
	  	blackDragonTasks = new BlackDragonTask[] {fightingTask};
	}
	
	@Override
	public void poll() {
		for (BlackDragonTask<?> task: blackDragonTasks) { if (task.activate()){ task.execute(); } }
	}

	@Override
	public void repaint(Graphics g) {
		Point Mouse = ctx.input.getLocation();
		g.setColor(mouseC);
        
		if (UtilConstants.stopped == false) {
	        milliseconds = this.getTotalRuntime();
	        seconds = (milliseconds / 1000) % 60;
	        minutes = (milliseconds / (1000*60) % 60);
	        hours = (milliseconds / (1000 * 60 * 60)) % 24;
        }
		
        if ((Mouse != null) && (mouseTrail != null)) { mouseTrail.add(Mouse); mouseTrail.draw(g); }
        
        CMouse.drawMouse(g, 2, mouseC, (int)Mouse.getX(), (int)Mouse.getY(), ctx.game.dimensions().height * 4, ctx.game.dimensions().width * 4);
        
        //Draw Top Box
        g.setColor(new Color(0, 0, 0, 225));
        g.fillRect(7, 295, 504, 38);
        
        g.setColor(new Color(255, 255, 255));
        g.drawRect(7, 295, 504, 38);
        
        g.drawString("JTut & Christmas", 20, 318);
        g.drawString("Duration: " + String.format("%02d:%02d:%02d", hours, minutes, seconds), 250, 318);
        g.drawString("P Loc: " /*+ (ctx.inventory.select().id(cons.SHIELD_ID).count())*/, 120, 318);
        g.drawString("Status: " + UtilConstants.status, 360, 318);
	}

}
