package com.paytm.sde.challenge;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageImpl implements MovingAverage{

	private Queue<Double> queue; //This is used for getting moving average
    private double sum; //Assuming data will not exceed Double.MAX_VALUE
    private int averageSize; //Requested N elements for average size.
    private LinkedList<Double> dataCollection; //This is used to track and get all elements
 
    public MovingAverageImpl(int averageSize) {
        queue = new LinkedList<Double>();
        dataCollection = new LinkedList<Double>();
        this.averageSize = averageSize;
    }
 
    public void addElement(double data) {
        if (queue.size() >= averageSize) {
            double dataToRemove = queue.poll();
            sum -= dataToRemove;
        }
 
        queue.add(data);
        dataCollection.add(data);
        sum += data;
    }
 
    public double getAverage() {
    	int size = dataCollection.size();
    	if(size<=0) {
    		return 0d;
    	}
    	if(size<=averageSize) {
    		return sum / size;
    	}
        return sum / averageSize;
    }
    
    public int getSize() {
    	return this.dataCollection.size();
    }

	public LinkedList<Double> getElements() {	
		return this.dataCollection;
	}
	
	public double getIndexedElement(int index) throws IndexOutOfBoundsException {
		if(dataCollection.size()>index) {
			return this.dataCollection.get(index);
		}else {
			throw new IndexOutOfBoundsException("Index out of Array bounds. Please use a valid index");
		}
	}
	
}
