package Pack;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.util.Random;

import javax.swing.JComponent;

public class Drop{
	private int x, y, ySpeed;
	
	Drop(){
		x = new Random().nextInt(1000);
		y = new Random().nextInt(1000);
		ySpeed = new Random().nextInt(2) + 1;
	}
	
	public void onRender(Graphics g) {
		update();
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 10, 30);
	}
		
    private void update() {
       y = y + ySpeed;
	   if (y == 1000) {
           y = 0;
		}
	}

      
}
