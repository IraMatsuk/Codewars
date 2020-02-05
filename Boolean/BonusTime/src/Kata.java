public class Kata{
  public static String bonusTime(int salary, final boolean bonus) {
	  if( bonus == true) {
    	salary *= 10; 	
    } 	  
	  return Integer.toString(salary);
  }
}
