package jp.co.worksap.global;

import java.util.NoSuchElementException;
import java.util.LinkedList;

public class ImmutableQueue<E> {

	private LinkedList<E> queue;
	/**
	 * requires default constructor.
	 */
	public ImmutableQueue() 
	{
		// modify this constructor if necessary, but do not remove default constructor
		queue = new LinkedList<E>();
	}


	private ImmutableQueue(LinkedList<E> queue) 
	{
		// modify or remove this constructor if necessary
		this.queue = queue;
	}
	
	// add other constructors if necessary
	/**
	 * Returns the queue that adds an item into the tail of this queue without modifying this queue.
	 * <pre>
	 * e.g.
	 * When this queue represents the queue (2, 1, 2, 2, 6) and we enqueue the value 4 into this queue,
	 * this method returns a new queue (2, 1, 2, 2, 6, 4)
	 * and this object still represents the queue (2, 1, 2, 2, 6) .
	 * </pre>
	 * If the element e is null, throws IllegalArgumentException.
	* @param e
	 * @return
	 * @throws IllegalArgumentException
	 */
	public  ImmutableQueue<E> enqueue(E e) 
	{
		// TODO: make this method faster
		if (e == null) 
		{
			throw new IllegalArgumentException();
		}
		
		LinkedList<E> clone = new LinkedList<E>(queue);
		clone.addLast(e);
		return new  ImmutableQueue<E>(clone);
	}



	/**
	 * Returns the queue that removes the object at the head of this queue without modifying this queue.
	 * <pre>
	 * e.g.
	 * When this queue represents the queue (7, 1, 3, 3, 5, 1) ,
	 * this method returns a new queue (1, 3, 3, 5, 1)
	 * and this object still represents the queue (7, 1, 3, 3, 5, 1) .
	 * </pre>
	 * If this queue is empty, throws java.util.NoSuchElementException.
	 * @return
	 * @throws java.util.NoSuchElementException
	 */
	public ImmutableQueue<E> dequeue() 
	{
		// TODO: make this method faster
		if (queue.size() == 0)
		{
			throw new NoSuchElementException();
		}
		LinkedList<E> clone = new LinkedList<E>(queue);
		clone.remove(0);
		return new ImmutableQueue<E>(clone);
	}


	/**
	 * Looks at the object which is the head of this queue without removing it from the queue.
	 * <pre>
	 * e.g.
	 * When this queue represents the queue (7, 1, 3, 3, 5, 1),
	 * this method returns 7 and this object still represents the queue (7, 1, 3, 3, 5, 1) 
	 * </pre>
	 * If the queue is empty, throws java.util.NoSuchElementException.
	 * @return 
	 * @throws java.util.NoSuchElementException
	 */
	public E peek() {
	// modify this method if needed
		if (queue.size() == 0)
		{
			throw new NoSuchElementException();
		}
		return queue.getFirst();
	}

	/**
	 * Returns the number of objects in this queue.
	 * @return
	 */
	public int size() 
	{
		// modify this method if necessary
		return queue.size();
	}
}



