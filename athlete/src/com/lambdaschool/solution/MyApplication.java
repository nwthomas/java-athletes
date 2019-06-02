package com.lambdaschool.solution;

public class MyApplication implements Processor
{
	private MessageService msgSrv;
	private String sport;
	private String athleteType;

	public MyApplication(MessageService msgSrv, String sport, String athleteType)
	{
		this.msgSrv = msgSrv;
		this.sport = sport;
		this.athleteType = athleteType;
	}

	@Override
	public void displayAthlete()
	{
		String msg = "************\n" + sport + " " + athleteType + "\n************\n";
		msgSrv.printMessage(msg);
	}

	@Override
	public String readAthlete()
	{
		return "Not Implemented";
	}
}
