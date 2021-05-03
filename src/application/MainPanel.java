package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import logging.LogWriter;

public class MainPanel extends JFrame
{
	
	private static int MAINMENUID = 2593, STARTID = 94568, CALENDERPAGEID = 4683;

	private static final long serialVersionUID = 1L;
	
	private ButtonManager buttonManager;
	
	private JButton toCalender, backtoMainMenu;
	
	private JPanel mainMenu, calendarPage;

	public MainPanel(String name) 
	{
		super(name);
		buttonManager = new ButtonManager();
		this.setLayout(null);
		setPages();
		LogWriter.write("Panels Created");
		goToMainMenu(STARTID);
	}
	
	public void goToCalender(int fromPanel)
	{
		if (fromPanel == MAINMENUID) 
		{
			LogWriter.write("arrived at removal");
			this.getContentPane().remove(mainMenu);
			this.getContentPane().add(calendarPage);
			LogWriter.write("Sucessfully went to calender from main menu");
		}
	}
	
	public void goToMainMenu(int fromPanel)
	{
		if (fromPanel == STARTID)
		{
			this.getContentPane().add(mainMenu);
		}
		else if (fromPanel == CALENDERPAGEID)
		{
			//TODO
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
		mainMenu.setLayout(null);
		backtoMainMenu = new JButton("Go Back To Main Menu");
		backtoMainMenu.setBounds(400, 400, 120, 80);
		backtoMainMenu.addActionListener(buttonManager);
		calendarPage.add(backtoMainMenu);
		LogWriter.write("Calender set");
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
			if (e.getSource().equals(backtoMainMenu))
			{
				LogWriter.write("Trying to go to main menu from calendar page");
				goToMainMenu(CALENDERPAGEID);
			}
		}
		
	}
	

}
