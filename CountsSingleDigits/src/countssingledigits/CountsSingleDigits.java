

package countssingledigits;

public class CountsSingleDigits {
	public static void main(String[] args)
	{
		// Create and declare array
		int[] numbers = createArray();
		
		// Count the occurrences of each integer
		int[] counts = countIntegers(numbers);
		
		// Display counts
		System.out.println("The occurrences of each integer are: ");
		displayCounts(counts);
		
	} // End of main method
	
	public static int[] createArray()
	{
		// Declare an array of integers and create it
		int[] numbers = new int[100];
		
		// Create integers randomly and assign them to the array
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = (int)(Math.random() * 10);
		
		// Return the array
		return numbers;
	} // End of createArray method
	
	public static int[] countIntegers(int[] numbers)
	{
		// Declare and create an array of 10 int
		int[] counts = new int[10];
		
		// For each integer in the array, count it
		for(int i = 0; i < numbers.length; i++)
			counts[numbers[i]]++;
		
		return counts;
	} // End of countIntegers method
	
	public static void displayCounts(int[] counts)
	{
		for(int i = 0; i < counts.length; i++)
		{
			if((i + 1) % 10 == 0)
				System.out.println(i + " occurs " + counts[i] + " time.");
			else
				System.out.println(i + " occurs " + counts[i] + " times.");
		}
	}
} 