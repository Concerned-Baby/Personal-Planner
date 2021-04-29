package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import logging.LogWriter;

public class MainPanel extends JFrame
{
	
	private static int MAINMENUID = 2593;

	private static final long serialVersionUID = 1L;
	
	private ButtonManager buttonManager;
	
	private JButton toCalender;
	
	private JPanel mainMenu, calendarPage;

	public MainPanel(String name) 
	{
		super(name);
		buttonManager = new ButtonManager();
		this.setLayout(null);
		setPages();
		LogWriter.write("MainPanel Created");
	}
	
	public void goToCalender(int fromPanel)
	{
		if (fromPanel == MAINMENUID) 
		{
			LogWriter.write("arrived at removal");
			
			LogWriter.write("Sucessfully went to calender from main menu");
		}
	}
	
	private JPanel createCalender(int month, int year)
	{
		LogWriter.write("creating calender " + month + " " + year);
		return new JCalender(month, year);
	}
	
	private void setPages()
	{
		//main menu
		mainMenu = new JPanel();
		mainMenu.setLayout(null);
		toCalender = new JButton("Go To Calander");
		toCalender.setBounds(400, 400, 120, 80);
		toCalender.addActionListener(buttonManager);
		mainMenu.add(toCalender);
		
		LogWriter.write("Menu set");
		//calendar
		calendarPage = new JPanel();
	}

	private class ButtonManager implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource().equals(toCalender))
			{
				LogWriter.write("Trying to go to calender from main menu");
				goToCalender(MAINMENUID);
				
			}
		}
		
	}
	

}
