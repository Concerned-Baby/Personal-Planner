package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import logging.LogWriter;

public class MainPanel extends JFrame
{

	private static final long serialVersionUID = 1L;
	
	private ButtonManager buttonManager;
	
	private JButton toCalender;

	public MainPanel(String name) 
	{
		super(name);
		buttonManager = new ButtonManager();
		LogWriter.write("MainPanel Created");
	}
	
	public void setMainMenu()
	{
		toCalender = new JButton("Go To Calander");
		toCalender.setBounds(400, 400, 120, 80);
		toCalender.addActionListener(buttonManager);
		this.add(toCalender);
		LogWriter.write("Menu set and displayed");
	}
	
	public void setCalander(int panel)
	{
		if (panel == 1) //from main menu
		{
			LogWriter.write("arrived at removal");
			this.remove(toCalender); //TODO actually remove button
			this.getContentPane().remove(toCalender);
			LogWriter.write("removed main menu");
			this.add(createCalender(CalenderHelper.DECEMBER, 2004));
			LogWriter.write("Sucessfully went to calender from main menu");
		}
	}
	
	private JPanel createCalender(int month, int year)
	{
		LogWriter.write("creating calender " + month + " " + year);
		return new JCalender(month, year);
	}

	private class ButtonManager implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource().equals(toCalender))
			{
				LogWriter.write("Trying to go to calender from main menu");
				setCalander(1);
				
			}
		}
		
	}
	

}
