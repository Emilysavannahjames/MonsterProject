package controller;

import Model.MarshmallowMonster;

public class Controller
{
	//data member section
	//declaration section
	
	private MarshmallowMonster myMonster;
	
	//constructors initialize data members
	
	public Controller()
	{
		myMonster = new MarshmallowMonster("Floyd", 3.2, 2, true, 4);
	}
	
	public void start ()
	{
		System.out.println(myMonster);
	}
}
