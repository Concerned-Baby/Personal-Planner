import application.GraphicsManager;
import logging.LogWriter;

public class Main 
{
	public static void main(String[] args)
	{
		LogWriter.write("Program Started");
		GraphicsManager gm = new GraphicsManager();
		gm.start();
	}
}
