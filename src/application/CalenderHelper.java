package application;

public class CalenderHelper
{
	
	//TODO add all the constants (months and weekdays)
	public static final int JANUARY = 1567;
	public static final int FEBRUARY = 2567;
	public static final int MARCH = 3567;
	public static final int APRIL = 4567;
	public static final int MAY = 5567;
	public static final int JUNE = 6567;
	public static final int JULY = 7567;
	public static final int AUGUST = 8567;
	public static final int SEPTEMBER = 9567;
	public static final int OCTOBER = 10567;
	public static final int NOVEMBER = 11567;
	public static final int DECEMBER = 12567;
	
	public static final int MONDAY = 1987;
	public static final int TUESDAY = 2987;
	public static final int WEDNESDAY = 3987;
	public static final int THURSDAY = 4987;
	public static final int FRIDAY = 5987;
	public static final int SATURDAY = 6987;
	public static final int SUNDAY = 7987;
	
	/**
	 * 
	 * @param month The month of the year, based on the constants in this class
	 * @param year The year number, based on the gregorian calander, revised 2020
	 * @return The length of the given month, in days
	 */
	public static int getMonthLength(int month, int year)
	{
		if (month == FEBRUARY)
		{
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				return 29;
			return 28;
		}
		if (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER)
			return 30;
		return 31;
	}
	
	public static int getMonthStartDate(int month, int year)
	{
		int k = Integer.MAX_VALUE;
		if (month == APRIL || month == JULY) k = 0;
		else if (month == JANUARY || month == OCTOBER) k = 1;
		else if (month == MAY) k = 2;
		else if (month == AUGUST) k = 3;
		else if (month == FEBRUARY || month == MARCH || month == NOVEMBER) k = 4;
		else if (month == MAY) k = 5;
		else if (month == SEPTEMBER || month == DECEMBER) k = 6;
		return (int)((k + (int)(2.6 * month - 2) - (2 * (year % 100) + year) + (int)(year / 4) + (int)((year % 100)) / 4) % 7);
	}
}
