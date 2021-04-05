package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class MainPanel extends JFrame
{

	private static final long serialVersionUID = 1L;
	
	private ButtonManager buttonManager;
	
	private JButton toCalender;

	public MainPanel(String name) 
	{
		super(name);
		buttonManager = new ButtonManager();
	}
	
	public void setMainMenu()
	{
		toCalender = new JButton("Go To Calander");
		toCalender.setBounds(400, 400, 120, 80);
		toCalender.addActionListener(buttonManager);
		this.add(toCalender);
	}
	
	public void setCalander(int panel)
	{
		if (panel == 1) //from main menu
		{
			this.remove(toCalender);
			this.add(createCalender(0, 0));
		}
	}
	
	private JComponent createCalender(int month, int year)
	{
		return null;
	}

	private class ButtonManager implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource().equals(toCalender))
			{
				setCalander(1);
			}
		}
		
	}
	

}
