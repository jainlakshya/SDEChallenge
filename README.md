# PaytmLabs SDE Challenge

## Coding Question

Write an interface for a data structure that can provide the moving average of the last N elements added, add elements to the structure and get access to the elements. Provide an efficient implementation of the interface for the data structure.

			### Interface

			interface encapuslates the essential functions and attributes of the data structure.	
			
			## Data structures
			
			As per our problem statement, Queue operates in similar fashion(FIFO = first in first out)
			I have used queue to make sure the size of queue is equal to size of window, when the size exceeds, I poll the element from the queue, which will remove the first entry and make space for new elements to avoid out of memory/out of disk space related issue
			
			To get access to all elements, I have used another data structure to store all the elements and access it. 
			Using queue and LinkedList allowed me to work without loops which further decreased code complexity and time.
			
			With bigger applications less data is persisted in memory and other elements can be stored in files and DB.

			### Implementation
			
			I have used queue to calculate the last N elements average in FIFO fashion. This decreased code complexity and time.
			 - If the requeted elements N is more than the data structure size, then the average is calculated based on the present elements and size in the data structure.
			 - If the requeted elements N is equal or less than the data structure size, then the average is calculated based on the sum of last N elements divided by N.

			We can accumulate the sum and calcualte the average each time adding a new number.
			Elements can be retrieved by sending an index value and IndexOutOfBoundsException is thrown in case of array size is less than index requested.

			#### Variables
			
			queue - This is used for getting moving average
			sum - Total sum of N elements
			averageSize - Requested N elements for average size.
			dataCollection - This is used to track and get all elements. Also to decrease code and time complexity

			#### Complexity

			- Add an element: `O(1)`
			- Get average: `O(1)`
			- Access an element or all elements: `O(1)`
			
			#### Test cases
			- com\paytm\sde\challenge\tests\MovingAverageTest.java




## Design Question

Design A Google Analytic like Backend System.
We need to provide Google Analytic like services to our customers. Please provide a high level solution design for the backend system. Feel free to choose any open source tools as you want.

			## Solution -  Provided solution on googleanalytics_solution.pdf 
