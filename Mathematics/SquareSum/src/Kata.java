
public class Kata {
	
	public static int squareSum(int[] n){
		int result = 0;	
		for(int element : n) {
			result += element*element;			
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(squareSum(new int[] {1,2,2}));
		System.out.println(squareSum(new int[] {1,2}));
		System.out.println(squareSum(new int[] {5,-3,4}));
	}
}
