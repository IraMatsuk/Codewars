import java.util.ArrayList;
import java.util.Arrays;

public class Kata {
	  public static int[] divisibleBy(int[] numbers, int divider) {
		  ArrayList<Integer> sortedList = new ArrayList<Integer>();
		  for (int item : numbers) {
			  if (item % divider == 0) {
				  sortedList.add(item);  
			  }
		  }			
		return sortedList.stream().mapToInt(Integer::intValue).toArray();
	 }
	  
	  public static int[] divisibleByEx(int[] numbers, int divider) {
		    return Arrays.stream(numbers)
	                 .filter(i -> (i % divider) == 0)
	                 .toArray();
	  }
}
