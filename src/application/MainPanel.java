package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainPanel extends JFrame implements ActionListener
{

	public MainPanel(String name) 
	{
		super(name);
	}
	
	public void setMainMenu()
	{
		JButton toCalander = new JButton("Go To Calander");
		toCalander.setBounds(400, 400, 120, 80);
		toCalander.addActionListener(this);
	}
	
	public void setCalander()
	{
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
	

}
