package dataformats;

public interface Activity 
{
	public Time getStartTime();
	
	public Time getEndTime();
	
	public boolean isDone();
	
	public void markAsDone();
	
	public void markAsUndone();
	
	public void setStartTime(Time t);
	
	public void setEndTime(Time t);
	
	public int getLengthMinutes();
}
