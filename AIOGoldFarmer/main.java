package AIOGoldFarmer;

import tutorialIsland.tcons;
import util.UtilConstants;
import util.UI.CMouse;
import util.UI.CMouse.MouseTrail;
import util.RunChecker;
import util.RunBug;
import util.Task;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;

import org.powerbot.script.PaintListener;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;

import org.powerbot.script.rt4.ClientContext;

import AIOGoldFarmer.tasks.*;
import AIOGoldFarmer.walks.*;

@Script.Manifest(name = "Gold Farmer", description = "sugma", properties = "author=xxjamyboixx; client=4")
public class main extends PollingScript<ClientContext> implements PaintListener, MouseListener {
	
	List<Task> taskList = new ArrayList<Task>();

	//ExtraFunc extra = new ExtraFunc(ctx);
    Random rand = new Random();

	private MouseTrail mouseTrail;
	
    Color mouseC = new Color(UtilConstants.mc1, UtilConstants.mc2, UtilConstants.mc3, 120);
    Color dTileC = new Color(UtilConstants.d1, UtilConstants.d2, UtilConstants.d3, 120);
	Color npcTileC = new Color(UtilConstants.n1, UtilConstants.n2, UtilConstants.n3, 120);
	Color tpTileC = new Color(UtilConstants.tp1, UtilConstants.tp2, UtilConstants.tp3, 120);
	Color textC = new Color(255, 255, 255);

	BufferedImage chat = downloadBackground("http://i64.tinypic.com/28cijyf.png", "chat.png");
	//BufferedImage guy = downloadBackground("http://i63.tinypic.com/1z2n4i1.jpg", "guy.png");
	//BufferedImage goblin = downloadBackground("http://i63.tinypic.com/1z2n4i1.jpg", "goblin.png");
	//BufferedImage clay = downloadBackground("http://i63.tinypic.com/1z2n4i1.jpg", "clay.png");
	//BufferedImage pickaxe = downloadBackground("http://i63.tinypic.com/1z2n4i1.jpg", "pickaxe.png");
	//BufferedImage iron = downloadBackground("http://i63.tinypic.com/1z2n4i1.jpg", "iron.png");
	BufferedImage redbox = downloadBackground("http://i63.tinypic.com/fw7leq.jpg", "redbox.png");
	BufferedImage x = downloadBackground("http://i65.tinypic.com/1q2y36.png", "x.png");
	BufferedImage unx = downloadBackground("http://i67.tinypic.com/i69hs0.png", "unx.png");

	Point p;
	
	Rectangle closeR = new Rectangle(58, 58, 23, 23);
	Rectangle tile = new Rectangle(58, 58, 23, 23);
	
	Font tr = new Font("Futura Md BT", Font.ITALIC + Font.BOLD, 18);
	
	public static long milliseconds, seconds, minutes, hours;
	
	public void start() {
		Gcons.INITIALIZE_AREAS();
		mouseTrail = new CMouse.MouseTrail();
		
		new CMouse();
		
		taskList.add(new PreReqs(ctx));
		taskList.add(new RunBug(ctx));
		taskList.add(new RunChecker(ctx));
	}

	public void stop() {
		System.out.println("Total Time To Complete: " + String.format("%02d:%02d:%02d", hours, minutes, seconds));
		UtilConstants.stopped = true;
	}
	
	@Override
	public void poll() {
		for(Task t : taskList) { if(t.activate()) { t.execute(); break; } }
	}
	
	public BufferedImage downloadBackground(String url, String name) {
		try {
			if (!new File(getStorageDirectory() + "\\" + name).exists()) download(url, name);
			File file = new File(getStorageDirectory() + "\\" + name);
			return ImageIO.read(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void paintImage(Graphics g, BufferedImage img, int x1, int y1, int x2, int y2) {
		if (ctx.game.resizable()) {
			g.drawImage(img, x1, (int) ctx.game.dimensions().getHeight() - y1, null);
		} else {
			g.drawImage(img, x2, y2, null);
		}
	}
	
	@Override
	public void mousePressed(MouseEvent e) { 
        if (closeR.contains(e.getPoint())) {
            if (UtilConstants.hidden == true) { UtilConstants.hidden = false; } else { UtilConstants.hidden = true; }
        }
        if (tile.contains(e.getPoint())) {
            if (UtilConstants.drawtiles == true) { UtilConstants.drawtiles = false; } else { UtilConstants.drawtiles = true; }
        }
	}
	
	@Override
	public void repaint(Graphics g) {
		g.setFont(tr);
		Point Mouse = ctx.input.getLocation();
		
        if (UtilConstants.hidden == false) {
			paintImage(g, chat, 0, 165, 0, 338);
			paintImage(g, redbox, 42, 137, 42, 366);
			//paintImage(g, guy, 235, 220, 235, 285);
			//paintImage(g, text, 58, 119, 58, 378);
        }
		
        if (UtilConstants.stopped == false) {
	        milliseconds = this.getTotalRuntime();
	        seconds = (milliseconds / 1000) % 60;
	        minutes = (milliseconds / (1000*60) % 60);
	        hours = (milliseconds / (1000 * 60 * 60)) % 24;
        }
    	
        g.setColor(textC);
        
        if (UtilConstants.hidden == false) {
    	    paintImage(g, x, 494, 191, 488, 344);
	        if (ctx.game.resizable()) {
	        	closeR = new Rectangle(494, (int) ctx.game.dimensions().getHeight() - 190, 25, 25);
				g.drawString("Duration: " + String.format("%02d:%02d:%02d", hours, minutes, seconds), 293, (int) ctx.game.dimensions().getHeight() - 60);
		        g.drawString("Status: " + tcons.status, 58, (int) ctx.game.dimensions().getHeight() - 60);
			} else {
	        	closeR = new Rectangle(488, (int) ctx.game.dimensions().getHeight() - 235, 25, 25);
		        g.drawString("Duration: " + String.format("%02d:%02d:%02d", hours, minutes, seconds), 293, 442);
		        g.drawString("Status: " + tcons.status, 58, 442);
			}
        } else {
    	    paintImage(g, unx, 494, 191, 488, 344);
    	    if (ctx.game.resizable()) {
    	    	closeR = new Rectangle(494, (int) ctx.game.dimensions().getHeight() - 190, 25, 25);
			} else {
				closeR = new Rectangle(488, (int) ctx.game.dimensions().getHeight() - 235, 25, 25);
			}
        }
        
        /*g.setColor(new Color(0, 200, 255));
        g.drawRect(closeR.x, closeR.y, closeR.width, closeR.height);
        g.setColor(new Color(255, 0, 0));
        g.drawRect(tile.x, tile.y, tile.width, tile.height);*/

        g.setColor(mouseC);
        
        if ((Mouse != null) && (mouseTrail != null)) { mouseTrail.add(Mouse); mouseTrail.draw(g); }
        
        CMouse.drawMouse(g, 2, mouseC, (int)Mouse.getX(), (int)Mouse.getY(), ctx.game.dimensions().height * 4, ctx.game.dimensions().width * 4);
    }

	@Override
	public void mouseEntered(MouseEvent e) { }

	@Override
	public void mouseExited(MouseEvent e) { }

	@Override
	public void mouseReleased(MouseEvent e) { }

	@Override
	public void mouseClicked(MouseEvent e) { }
}
