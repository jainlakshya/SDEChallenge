package com.paytm.sde.challenge;

public class MainApp {

	public static void main(String[] args) throws IndexOutOfBoundsException {
		 MovingAverage movingAverage = new MovingAverageImpl(4);
		 
	        movingAverage.addElement(3);
	        System.out.println(movingAverage.getAverage());
	        movingAverage.addElement(5);
	        System.out.println(movingAverage.getAverage());
	        movingAverage.addElement(2);
	        System.out.println(movingAverage.getAverage());
	        movingAverage.addElement(8);
	        System.out.println(movingAverage.getAverage());
	        movingAverage.addElement(1);
	        System.out.println(movingAverage.getAverage());
	        movingAverage.addElement(2);
	        System.out.println(movingAverage.getAverage());
	        movingAverage.addElement(9);
	        System.out.println(movingAverage.getAverage());
	        movingAverage.addElement(1.5d);
	        System.out.println(movingAverage.getAverage());
	        movingAverage.addElement(7.5d);
	        System.out.println(movingAverage.getAverage());
	        movingAverage.addElement(5.5d);
	        System.out.println(movingAverage.getAverage());
	 

	}

}
