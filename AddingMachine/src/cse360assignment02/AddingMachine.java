package cse360assignment02;

public class AddingMachine 
{
	private int total;
	private String history; 
	
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
		history = "0";
	}
  
	public int getTotal () 
	{
		return total;
	}
  
	public void add (int value) 
	{
		int temp1 = value;
		total = total + temp1;
		history = history + " + " + temp1;  
	}

	public void subtract (int value) 
	{
		int temp2 = value;
		total = total + temp2;
		history = history + " - " + temp2;
	}

	public String toString () 
	{
		return history;
	}

	public void clear() 
	{
		history = "";
	}
	
	
	
	
	
	// the main method
	public static void main(String[] args)
	{
		AddingMachine myCalculator = new AddingMachine();
		
		myCalculator.add (4); 
		myCalculator.subtract (2); 
		myCalculator.add(5);
		
		System.out.println(myCalculator.toString());
	}
} 


