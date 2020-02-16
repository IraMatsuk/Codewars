import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nessie {
    public static boolean isLockNessMonster(String s){
    	Pattern pattern = Pattern.compile(".+(tree fiddy|3.50|three fifty)");
    	Matcher matcher = pattern.matcher(s);
    	if (matcher.find()){
    	    return true;
    	}
		return false;
    }
}
