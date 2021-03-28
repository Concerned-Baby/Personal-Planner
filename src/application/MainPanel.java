package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainPanel extends JFrame
{

	private static final long serialVersionUID = 1L;
	
	private ButtonManager buttonManager;

	public MainPanel(String name) 
	{
		super(name);
		buttonManager = new ButtonManager();
	}
	
	public void setMainMenu()
	{
		JButton toCalander = new JButton("Go To Calander");
		toCalander.setBounds(400, 400, 120, 80);
		toCalander.addActionListener(buttonManager);
	}
	
	public void setCalander()
	{
		
	}

	private class ButtonManager implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			//TODO
		}
		
	}
	

}
