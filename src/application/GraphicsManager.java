package application;


import javax.swing.JFrame;

public class GraphicsManager 
{
	MainPanel frame;
	
	public GraphicsManager()
	{
		frame = new MainPanel("Personal Planner");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
	
	public void start()
	{
		frame.setVisible(true);
		frame.setMainMenu();
	}
}
