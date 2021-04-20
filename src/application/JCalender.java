package application;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JCalender extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private int month, year, days, startDay;

	public JCalender(int month, int year)
	{
		this.month = month;
		this.year = year;
		days = CalenderHelper.getMonthLength(month, year);
		startDay = CalenderHelper.getMonthStartDate(month, year);
		
		this.setLayout(new GridLayout(6, 7));
		
		createLables();
		setDates();
	}
	
	public String toString()
	{
		return month + " " +  year; //QUICK FIX
	}
	
	private void createLables()
	{
		this.add(new DateBox("Sunday"));
		this.add(new DateBox("Monday"));
		this.add(new DateBox("Tuesday"));
		this.add(new DateBox("Wednesday"));
		this.add(new DateBox("Thursday"));
		this.add(new DateBox("Friday"));
		this.add(new DateBox("Saturday"));
	}
	
	private void setDates()
	{
		for (int i = 0; i < startDay; i++)
		{
			this.add(new DateBox("x"));
		}
		for (int i = 0; i < days; i++)
		{
			this.add(new DateBox(i + ")"));
		}
		for (int i = 0; i < 42 - startDay - days; i++)
		{
			this.add(new DateBox("X"));
		}
	}
	
	
	private class DateBox extends JLabel
	{
		public DateBox(String label)
		{
			super(label);
			this.setSize(100, 100);
		}
	}
}
