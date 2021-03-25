package application;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainPanel extends JFrame
{

	public MainPanel(String name) 
	{
		super(name);
	}
	
	public void setMainMenu()
	{
		JButton toCalander = new JButton("Go To Calander");
		toCalander.setBounds(400, 400, 120, 80);
	}
	
	public void setCalander()
	{
		
	}
	

}
