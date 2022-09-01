package myFirstGraphics;

import javax.swing.*;
import java.awt.*;


public class GuiWindow {

	public static void main(String[] args) {
		
		JFrame theGui = new JFrame();
		theGui.setTitle("First GUI Program");
		theGui.setSize(300,200);
		theGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		
		Container pane = theGui.getContentPane();
		pane.add(panel);
		
		theGui.setVisible(true);
		
		
		JFrame two = new JFrame();
		two.setSize(300,200);
		two.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel g = new JPanel();
		g.setBackground(new Color(200,100,200));
		
		Container tupperaware = two.getContentPane();
		tupperaware.add(g);
		
		two.setLocation(800,200);
		two.setVisible(true);
		

		
		
	}//end main
}//end class
