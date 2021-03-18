package dataformats;

public class Time 
{
	
	public Time(int hour, int minute)
	{
		
	}
	
	public int getHour()
	{
		return 0;
	}
	
	public int getMinute()
	{
		return 0;
	}
	
	public void setHour()
	{
		
	}
	
	public void setMinute()
	{
		
	}
	
	public int timeTo(Time that)
	{
		return (that.getHour() - this.getHour()) * 60 + (that.getMinute() - this.getMinute());
	}
}
