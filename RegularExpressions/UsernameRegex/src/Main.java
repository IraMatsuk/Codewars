
public class Main {
	public static void main(String[] args) {
		System.out.println(UsernameRegex.validateUsr("regex"));
		System.out.println(UsernameRegex.validateUsr("a"));
		System.out.println(UsernameRegex.validateUsr("Hass"));
		System.out.println(UsernameRegex.validateUsr("Hasd_12assssssasasasasasaasasasasas"));
		System.out.println(UsernameRegex.validateUsr(""));
		System.out.println(UsernameRegex.validateUsr("____"));
		System.out.println(UsernameRegex.validateUsr("012"));
		System.out.println(UsernameRegex.validateUsr("p1pp1"));
		System.out.println(UsernameRegex.validateUsr("asd43 34"));
		System.out.println(UsernameRegex.validateUsr("asd43_34"));
	}
}
