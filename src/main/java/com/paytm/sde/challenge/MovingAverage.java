package com.paytm.sde.challenge;

import java.util.LinkedList;

public interface MovingAverage {

	/**
	 * Returns the average of last n elements. If average size is more than number of elements in data structure, then average of 2 elements is returned.
	 * Returns 0 is data set is empty. 
	 * @param numberOfItems
	 * @return average
	 */
	double getAverage();


	/**
	 * Adds an element to the data structure. FIFO is used to calculate sum and linkedList to store all elements
	 * @param element
	 */
	void addElement(double data);

	/**
	 * Returns the element at a specified position
	 * @param index
	 * @return
	 * @throws IndexOutOfBoundException if index is less than 0, or greater than total number of items in the data structure.
	 */
	double getIndexedElement(int index) throws IndexOutOfBoundsException ;
	
	
	/**
	 * Returns all the elements with the data structure
	 * @return
	 */
	LinkedList<Double> getElements();
	
	/**
	 * Returns the size of the data structure
	 * @return
	 */
	int getSize();
	
}
