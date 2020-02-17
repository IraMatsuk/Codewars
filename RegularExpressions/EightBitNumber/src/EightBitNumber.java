
public class EightBitNumber {
	public static boolean eightBitNumber(String n) {   
		String regex = "^[0-9][0-9]{1,3}$";
		return n.matches(regex);
	}	
}
