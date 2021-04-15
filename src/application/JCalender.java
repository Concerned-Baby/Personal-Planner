package application;

import java.awt.GridLayout;

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
		
		this.setLayout(new GridLayout());
		
		createLables();
		setDates();
	}
	
	private void createLables()
	{
		
	}
	
	private void setDates()
	{
		
	}
}
