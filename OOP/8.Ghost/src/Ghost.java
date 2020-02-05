import java.util.Random;

public class Ghost {
	public Ghost() {

	}
	
	public String getColor() {
		Random rand = new Random();
		int randNum = rand.nextInt(4);
		switch (randNum) {
		case 0: color  = "white";
		break;
		case 1: color = "yellow";
		break;
		case 2: color = "purple";
		break;
		case 3: color = "red";
		break;
		}
		return this.color;
	}
	
	private String color;
}
