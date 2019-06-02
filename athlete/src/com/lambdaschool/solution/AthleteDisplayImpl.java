package com.lambdaschool.solution;

public class AthleteDisplayImpl implements MessageService
{
	@Override
	public void printMessage(String message)
	{
		System.out.println(message);
	}

	@Override
	public String readAthlete()
	{
		return "Not Implemented";
	}
}
