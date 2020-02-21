
public class Kata {
    public static int expressionsMatter(int a, int b, int c){
		int result = 0;
		int max = 0;
	
		if((result = (a+b+c)) > max) {
			max = result;
		} 
		if((result = (a*b+c)) > max) {
			max = result;
		} 
		if((result = (a+b*c)) > max) {
			max = result;
		} 
		if((result = (a*b*c)) > max) {
			max = result;
		} 
		if((result = ((a+b)*c)) > max) {
			max = result;
		} 
		if((result = (a*(b+c))) > max) {
			max = result;
		}
		return max;
    } 
}
