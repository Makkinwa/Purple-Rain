package Pack;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class BackGroundPanel extends Canvas {
	private BufferStrategy bs;
	private Graphics g;
	Drop[] drop = new Drop[300];
	
     public BackGroundPanel() {
    	 setBackground(Color.lightGray);
    	 for (int i = 0; i < drop.length; i++) {
 			drop[i] = new Drop();
 		}
	}
     
     public void render() {
 		if (bs == null)
 			createBufferStrategy(3);
 		bs = getBufferStrategy();
 		
 		g = bs.getDrawGraphics();
 		g.setColor(Color.lightGray);
 		g.fillRect(0, 0, getWidth(), getHeight());
 		onRender(g);
 		g.dispose();
 		bs.show();
 		
		try {
 			Thread.sleep(1);
 		} catch (InterruptedException e) {
 		}
 		
 		EventQueue.invokeLater(() -> render());
 }

     private void onRender(Graphics g) {
 		for (int i = 0; i < drop.length; i++)
 			drop[i].onRender(g);
 }
     

 

}
