package application;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GraphicsManager 
{
	MainPanel frame;
	
	public GraphicsManager()
	{
		frame = new MainPanel("Personal Planner");
		
		frame.setSize(800, 600);
		frame.setMinimumSize(new Dimension(100,100));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		frame.setVisible(true);
	}
}
