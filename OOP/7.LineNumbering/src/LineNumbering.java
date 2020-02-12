import java.util.*;

public class LineNumbering {
	
    public static List<String> number(List<String> lines) {
    	
    	int n = 1;
    	for(int i = 0; i < lines.size(); i++) {
    		n += i;
    	}
		return lines;
        
    }
}
