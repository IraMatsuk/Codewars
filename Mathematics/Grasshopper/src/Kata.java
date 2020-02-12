
public class Kata {
    public static boolean checkForFactor(int base, int factor) {
    	if(base % factor == 0) {
    		return true;
    	}
        return false;
    }
    
    public static void main(String[] args) {
    	System.out.println(checkForFactor(12, 7));
    }
}
