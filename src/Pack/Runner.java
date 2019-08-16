package Pack;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Runner {
	
	public static void createGUI() {
		JFrame f = new JFrame("Rain");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setPreferredSize(new Dimension(1000, 1000));
		f.setLocation(800, 100);
		f.setBackground(Color.lightGray);
		BackGroundPanel bg = new BackGroundPanel();
		f.add(bg);
		f.pack();
		f.setVisible(true);
		bg.render();
	}
		
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Start");
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
			
		}
			
	
	
}
 



     