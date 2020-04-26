package com.paytm.sde.challenge.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import com.paytm.sde.challenge.MovingAverage;
import com.paytm.sde.challenge.MovingAverageImpl;

public class MovingAverageTest {
	
	private MovingAverage movingAverage;
    private final int averageSize = 3; 
    private static final double DELTA = 1e-15;


    @Before
    public void init() {
        movingAverage = new MovingAverageImpl(averageSize);
    }

    @Test
    public void addElementOneTest() {

        movingAverage.addElement(10d);
        assertEquals(1, movingAverage.getSize());
        assertEquals(10d, movingAverage.getIndexedElement(0), DELTA);
    }

    @Test
    public void addElementFirstTest() {
        movingAverage.addElement(2.1d);
        movingAverage.addElement(4.0d);
        movingAverage.addElement(10.3d);
        assertEquals(3, movingAverage.getSize());

        assertEquals(2.1d, movingAverage.getIndexedElement(0), DELTA);
    }

    @Test
    public void getIndexedElementEmptyListTest() {
        try {
            movingAverage.getIndexedElement(0);
            fail("IndexOutofBoundException should have been thrown");
        } catch (IndexOutOfBoundsException e) {
            //Pass
            assertTrue(true);
        }

    }

    @Test
    public void getAllIndexedElementIndexTest() {

        movingAverage.addElement(2.1d);
        movingAverage.addElement(4.0d);
        movingAverage.addElement(10.3d);
        
        LinkedList<Double> testDataCollection = new LinkedList<Double>(Arrays.asList(2.1d,4.0d,10.3d));
        
        assertEquals(testDataCollection, movingAverage.getElements());

    }

    @Test
    public void getMovingAverageEmptyList() {
        assertEquals(0d, movingAverage.getAverage(), DELTA);
    }

    @Test
    public void getMovingAverageSizeLessThanN() {
        movingAverage.addElement(2.1d);
        movingAverage.addElement(1.9d);
        
        //It will take average of two elements as currently we don't have 3 elements in the list (3 is Nth average size)
        assertEquals(2d, movingAverage.getAverage(), DELTA);
    }

    @Test
    public void getMovingAverageSizeEqualsN_3() {
        movingAverage.addElement(3.5d);
        movingAverage.addElement(2.1d);
        movingAverage.addElement(4.0d);
        assertEquals(3.2d, movingAverage.getAverage(), DELTA);
    }


    @Test
    public void getMovingAverageSizeGreaterThanN() {
        movingAverage.addElement(2.16d);
        movingAverage.addElement(3.53d);
        movingAverage.addElement(4.01d);
        movingAverage.addElement(6.35d);
        //It will take average of last three elements as currently have Nth average size set to 3
        assertEquals(4.63d, movingAverage.getAverage(), DELTA);
    }
}
