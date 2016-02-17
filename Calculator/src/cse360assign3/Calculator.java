package cse360assign3;

/** 
 * Computes arithmetic operations on a total value
 * 
 *  @author Meera Benson PIN:121
 *  @version Feb 22, 2016
 *  
 */

public class Calculator 
{

	private int total;
	
	/**
	 * Initiates the total to 0
	 * 
	 * @param none
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the total
	 * 
	 * @param none
	 * @return total        The total value
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * Adds a value to the total
	 * 
	 * @param value      The value to be added
	 */
	public void add (int value) 
	{
		total = total + value;
	}
	
	/**
	 * Subtracts a value from the total
	 * 
	 * @param value      The value to be subtracted
	 */
	public void subtract (int value) 
	{
		total = total - value;
	}
	
	/**
	 * Multiplies the total by a value
	 * 
	 * @param value      The value to multiply by
	 */
	public void multiply (int value) 
	{
		total = total * value;
	}
	
	/**
	 * Divides the total by a value
	 * 
	 * @param value      The value to divide by
	 */
	public void divide (int value) 
	{
		if(value == 0)
			total = 0;
		
		else
			total = total/value;
	}
	
	/**
	 * Returns the operations performed in a string
	 * 
	 * @param none
	 * @returns ""       An empty string for now
	 */
	public String getHistory () 
	{
		return "";
	}
	
}