package com.utube;

public class Bus {
	private int num;
	private boolean ac;
	private int seat;
	
	Bus(int no, boolean ac, int cap)
	{
		this.num = no;
		this.ac = ac;
		this.seat = cap;
	}
	
	public int getseat()
	{
		return seat;
	}
	public void setseat(int cap)
	{
		seat=cap;
		
	}
	public void setac(boolean val) {
		this.ac=val;
	}
	public int getnum() {
		return num;
	}
	public boolean getac() {
		return ac;
	}
	public void displayBusInfo(){
		System.out.println("Bus No:" + num + "AC:" + ac + "Total Capacity" + seat);
	}
	
}
