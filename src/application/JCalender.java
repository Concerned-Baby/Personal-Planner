package application;

import javax.swing.JPanel;

public class JCalender extends JPanel
{
	private static final long serialVersionUID = 1L;

	public JCalender(int month, int year)
	{
		int days = CalenderHelper.getMonthLength(month, year);
	}
}
