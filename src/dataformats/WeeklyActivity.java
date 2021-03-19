package dataformats;

public class WeeklyActivity implements Activity
{
	Time start, end;
	boolean done;
	
	public WeeklyActivity(Time start, Time end)
	{
		this.start = start;
		this.end = end;
		done = false;
	}

	@Override
	public Time getStartTime() 
	{
		return start;
	}

	@Override
	public Time getEndTime() 
	{
		return end;
	}

	@Override
	public boolean isDone() 
	{
		return done;
	}

	@Override
	public void markAsDone() 
	{
		done = true;
	}
	

	@Override
	public void setStartTime(Time t) 
	{
		start = t;
	}

	@Override
	public void setEndTime(Time t) 
	{
		end = t;
	}

	@Override
	public int getLengthMinutes() 
	{
		return end.timeTo(start);
	}

}
