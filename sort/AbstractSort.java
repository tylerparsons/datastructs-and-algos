/**
 * AbstractSort.java
 * Created: 2 Feb 2015
 * @author	Tyler Parsons
 */
package sort;

/**
 * @author Tyler
 *
 */
public abstract class AbstractSort<T extends Comparable<T>> {

/***********************
 * Performance Metrics *
 ***********************/
	
	/**
	 * Number of comparisons made by sorting algorithm.
	 */
	protected int nCompares = 0;
	/**
	 * Number of assignments made by sorting algorithm.
	 */
	protected int nAssigns = 0;
	
/********************
 * Abstract Methods *
 ********************/
	
	/**
	 * Sorts array using implementation
	 * determined by subclass.
	 * 
	 * @param arr	array to sort
	 * @param lo	lower bound of array section to sort
	 * @param hi	upper bound of array section to sort
	 */
	public abstract void sort(T[] arr, int lo, int hi);

/*********
 * Utils *
 *********/
	
	/**
	 * Calls {@link #sort(Comparable[], int, int)}
	 * with the first and last index of {@code arr}.
	 * @param arr
	 */
	public void sort(T[] arr) {
		sort(arr, 0, arr.length-1);
	}
	
	/**
	 * Assigns {@code t} to {@code array[i]}.
	 * @param arr	some array
	 * @param i		some index
	 * @param t		some T
	 */
	protected void assign(T[] arr, int i, T t) {
		nAssigns++;
		arr[i] = t;
	}
	
	/**
	 * Invokes {@link java.lang.Comparable#compareTo(Object)}
	 * with {@code from} on {@code to}.
	 * 
	 * @param from	some T
	 * @param to	some T
	 * @return		int representing comparison
	 * @see	java.lang.Comparable#compareTo(Object)
	 */
	protected int compareTo(T from, T to) {
		nCompares++;
		return from.compareTo(to);
	}
	
	/**
	 * Swaps the elements of the array at
	 * indices {@code i1} snd {@code i2}.
	 * 
	 * @param arr	some array
	 * @param i1	an index
	 * @param i2	an index
	 */
	protected void swap(T[] arr, int i1, int i2) {
		nAssigns += 2;
		T swap = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = swap;
	}
	
}