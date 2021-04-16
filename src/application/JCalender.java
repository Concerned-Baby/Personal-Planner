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
		
		this.setLayout(new GridLayout());
		
		createLables();
		setDates();
	}
	
	private void createLables()
	{
		this.add(new JLabel("Sunday"));
		this.add(new JLabel("Monday"));
		this.add(new JLabel("Tuesday"));
		this.add(new JLabel("Wednesday"));
		this.add(new JLabel("Thursday"));
		this.add(new JLabel("Friday"));
		this.add(new JLabel("Saturday"));
	}
	
	private void setDates()
	{
		
	}
}
