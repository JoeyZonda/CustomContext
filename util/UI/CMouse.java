package util.UI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import util.UtilConstants;

public class CMouse {
	
    public final static class MouseTrail {
        private final int SIZE = 25;
        private final double ALPHA_STEP = (255.0 / SIZE);
        private final Point[] points;
        private int index;

        public MouseTrail() {
            points = new Point[SIZE];
            index = 0;
        }

        public void add(final Point p) {
            points[index++] = p;
            index %= SIZE;
        }

        public void draw(final Graphics g) {
            double alpha = 0;

            for (int i = index; i != (index == 0 ? SIZE - 1 : index - 1); i = (i + 1) % SIZE) {
                if (points[i] != null && points[(i + 1) % SIZE] != null) {
                    g.setColor(new Color(UtilConstants.mc1, UtilConstants.mc2, UtilConstants.mc3, (int) alpha));
                    g.drawLine(points[i].x, points[i].y, points[(i + 1) % SIZE].x, points[(i + 1) % SIZE].y);
                    alpha += ALPHA_STEP;
                }
            }
        }
    }
    
    public static void drawMouse(Graphics g, int loop, Color c, int mX, int mY, int sizeX, int sizeY) {
		
		g.setColor(c);

		int mouseY = mY;
		int mouseX = mX;
		
		for(int i = 0; i < loop; i++) {
			if (i == 0) {
				//y line
				g.drawLine(mouseX, mouseY + sizeY, mouseX, mouseY - sizeY);
				
				//x line
				g.drawLine(mouseX + sizeX, mouseY, mouseX - sizeX, mouseY);
			} else {
				//y line
				g.drawLine(mouseX + i, mouseY + sizeY, mouseX + i, mouseY - sizeY);
				g.drawLine(mouseX - i, mouseY + sizeY, mouseX - i, mouseY - sizeY);
				
				//x line
				g.drawLine(mouseX + sizeX, mouseY + i, mouseX - sizeX, mouseY + i);
				g.drawLine(mouseX + sizeX, mouseY - i, mouseX - sizeX, mouseY - i);
			}
		}
	}
}
