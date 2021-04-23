package application;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import logging.LogWriter;

public class JCalender extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private int month, year, days, startDay;
	
	private final int rows = 6, columns = 7;

	public JCalender(int month, int year)
	{
		LogWriter.write("Creating a calender");
		this.month = month;
		this.year = year;
		days = CalenderHelper.getMonthLength(month, year);
		startDay = CalenderHelper.getMonthStartDate(month, year);
		
		LogWriter.write("Calender starting set up");
		this.setLayout(new GridLayout(rows, columns));
		
		createLables();
		setDates();
		LogWriter.write("Calender finished set up");
	}
	
	public String toString()
	{
		if (month == CalenderHelper.JANUARY) return "January " + year;
		if (month == CalenderHelper.FEBRUARY) return "February " + year;
		if (month == CalenderHelper.MARCH) return "March " + year;
		if (month == CalenderHelper.APRIL) return "April " + year;
		if (month == CalenderHelper.MAY) return "May " + year;
		if (month == CalenderHelper.JUNE) return "June " + year;
		if (month == CalenderHelper.JULY) return "July " + year;
		if (month == CalenderHelper.AUGUST) return "August " + year;
		if (month == CalenderHelper.SEPTEMBER) return "September " + year;
		if (month == CalenderHelper.OCTOBER) return "October " + year;
		if (month == CalenderHelper.NOVEMBER) return "November " + year;
		if (month == CalenderHelper.DECEMBER) return "December " + year;
		return "ERROR";
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
			this.add(new DateBox(" X "));
		}
		for (int i = 0; i < days; i++)
		{
			this.add(new DateBox(i + ")"));
		}
		for (int i = 0; i < rows * columns - startDay - days; i++)
		{
			this.add(new DateBox(" X "));
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
