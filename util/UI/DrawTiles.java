package util.UI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import org.powerbot.script.Area;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Npc;
import org.powerbot.script.rt4.TilePath;

public class DrawTiles extends ClientAccessor {

	public DrawTiles(ClientContext ctx) { super(ctx); }

	public void DrawPlayerTile(Graphics g, Color colorOutline, Color colorFill) {
		if (ctx.players.local() != null) {
			Tile tile = ctx.players.local().tile();
			// Outline
			g.setColor(colorOutline);
			g.drawPolygon(tile.matrix(ctx).bounds());
			// Fill
			g.setColor(colorFill);
			g.fillPolygon(tile.matrix(ctx).bounds());
		}
	}
	
	public void DrawNpcTile(Graphics g, Color colorOutline, Color colorFill, int npcId) {
		if (ctx.players.local() != null) {
			Tile tile = ctx.npcs.select().nearest().id(npcId).poll().tile();
			// Outline
			g.setColor(colorOutline);
			g.drawPolygon(tile.matrix(ctx).bounds());
			// Fill
			g.setColor(colorFill);
			g.fillPolygon(tile.matrix(ctx).bounds());
		}
	}
	
	public void DrawNpcTilesInRooms(Graphics g, Color colorOutline, Color colorFill, int[] npcId, Area[] area) {
		int i;
		int n = npcId.length;
		for (i = 0; i < n; i++) {
			if (!ctx.npcs.select().id(npcId[i]).isEmpty() && area[i].contains(ctx.players.local())) {
				Npc npc = ctx.npcs.select().id(npcId[i]).poll();
				Tile tile = npc.tile();
				// Fill
				g.setColor(colorFill);
				g.fillPolygon(tile.matrix(ctx).bounds());
				// Outline
				g.setColor(colorOutline);
				g.drawPolygon(tile.matrix(ctx).bounds());
			}
		}
	}
	
	public void DrawAllNpcTiles(Graphics g, Color colorOutline, Color colorFill) {
		if (ctx.npcs.select() != null) {
			for (Npc n : ctx.npcs.select()) {	
				g.setColor(colorFill);
				g.fillPolygon(n.tile().matrix(ctx).bounds());		
			}
		}
	}
	
	public void DrawNpcTiles(Graphics g, int[] npcs, Color colorOutline, Color colorFill) {
		if (npcs != null) {
			int i;
			int n = npcs.length;
			for (i = 0; i < n; i++) {
				Tile ts = ctx.npcs.select().nearest().id(npcs[i]).poll().tile();
				if (ts == null) { break; }
				// Outline
				g.setColor(colorOutline);
				g.drawPolygon(ts.matrix(ctx).bounds());
				// Fill
				g.setColor(colorFill);
				g.fillPolygon(ts.tile().matrix(ctx).bounds());
			}
		}
	}
	
	public void DrawTileOnMouse(Graphics g, Color colorOutline, Color colorFill, Tile tile, org.powerbot.script.Area area, Point Mouse) {
		for(Tile t : area.tiles()) {
			if(t.matrix(ctx).bounds().contains(Mouse.getLocation())) {
                tile = t;
                break;
            }
		}
		
		if (tile != null) {
			// Outline
			g.setColor(colorOutline);
			g.drawPolygon(tile.matrix(ctx).bounds());
			// Fill
			g.setColor(colorFill);
			g.fillPolygon(tile.matrix(ctx).bounds());
		}
		/*
		final Tile tile = ctx.players.local().tile();
		int search = 10;
		final Area area = new Area(new Tile(tile.x()-search, tile.y()-search, tile.floor()), new Tile(tile.x()+search, tile.y()+search, tile.floor()));
		drawTile.DrawTileOnMouse(g, npcTileC, npcTileC, tile, area, Mouse);
		put above code in main
		*/
	}
	
	public void DrawTilePath(Graphics g, Color colorOutline, Color colorFill, TilePath tilepath) {
		if (tilepath != null) {
			// Outline
			g.setColor(colorOutline);
			//g.drawPolygon(tile.matrix(ctx).bounds());
			// Fill
			g.setColor(colorFill);
			//g.fillPolygon(tile.matrix(ctx).bounds());
		}
	}
	
	public void DrawDestinationTile(Graphics g, Color colorOutline, Color colorFill) {
		if (ctx.movement.destination().tile() != null) {
			Tile tile = ctx.movement.destination().tile();
			// Outline
			g.setColor(colorOutline);
			g.drawPolygon(tile.matrix(ctx).bounds());
			// Fill
			g.setColor(colorFill);
			g.fillPolygon(tile.matrix(ctx).bounds());
		}
	}
	
	public void DrawTile(Graphics g, Color colorOutline, Color colorFill, Tile t) {
		if (t != null) {
			// Outline
			g.setColor(colorOutline);
			g.drawPolygon(t.matrix(ctx).bounds());
			// Fill
			g.setColor(colorFill);
			g.fillPolygon(t.matrix(ctx).bounds());
		}
	}
}
