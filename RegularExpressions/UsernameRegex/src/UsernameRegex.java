
public class UsernameRegex {
	public static boolean validateUsr(String s) {
		String validUsername = "[a-z0-9_]{4,16}";
		return s.matches(validUsername);
	}
}
