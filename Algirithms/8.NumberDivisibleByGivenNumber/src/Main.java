
public class Main {

	public static void main(String[] args) {		
	    int[] outputArray = Kata.divisibleBy(new int[] {1,2,3,4,5,6},2);
	    for (int item : outputArray) {
			System.out.printf("%d ", item );			
		}
	    System.out.println();
	    
	    outputArray = Kata.divisibleBy(new int[] {1,2,3,4,5,6},3);
	    for (int item : outputArray) {
			System.out.printf("%d ", item );			
		}
	    System.out.println();
	    
	    outputArray = Kata.divisibleBy(new int[] {0,1,2,3,4,5,6},4);
	    for (int item : outputArray) {
			System.out.printf("%d ", item );			
		}
	    System.out.println();
	    return;
	}
}
