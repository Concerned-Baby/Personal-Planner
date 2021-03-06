package application;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import logging.LogWriter;

public class MainPanel extends JFrame
{
	
	private static int MAINMENUID = 6676, STARTID = 6677, CALENDERPAGEID = 6678;

	private static final long serialVersionUID = 1L;
	
	private ButtonManager buttonManager;
	
	private JButton toCalender, backtoMainMenu;
	
	private JPanel mainMenu, calendarPage;

	public MainPanel(String name) 
	{
		super(name);
		buttonManager = new ButtonManager();
		
		//setLayout(null);
		setPages();
		
		LogWriter.write("Panels Created");
		
		goToMainMenu(STARTID);
	}
	
	public void goToCalender(int fromPanel)
	{
		if (fromPanel == MAINMENUID) 
		{
			LogWriter.write("arrived at removal");
			removeFrame(mainMenu);
		}
		displayFrame(calendarPage);
		LogWriter.write("Sucessfully went to calender");
	}
	
	public void goToMainMenu(int fromPanel)
	{
		if (fromPanel == STARTID);
		else if (fromPanel == CALENDERPAGEID) removeFrame(calendarPage);;
		displayFrame(mainMenu);
		LogWriter.write("Sucessfully went to main menu");
	}
	
	private void displayFrame(JPanel p)
	{
		this.getContentPane().add(p, BorderLayout.CENTER);
	}
	
	private void removeFrame(JPanel p)
	{
		this.getContentPane().remove(p);
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
