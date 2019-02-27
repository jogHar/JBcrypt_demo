import org.mindrot.jbcrypt.BCrypt;

public class PasswordGenerator {
	public static void main(String args[]){
		String password = args[0];
		String hashedPassword = passwordHash(password);
		System.out.println(hashedPassword);
		checkPass(password, hashedPassword);
		
	}
	public static String passwordHash(String password){
		return BCrypt.hashpw(password, BCrypt.gensalt());
	}
	public static void checkPass(String plainPassword, String hashedPassword) {
		if (BCrypt.checkpw(plainPassword, hashedPassword))
			System.out.println("Match");
		else
			System.out.println("Not Match");
	}
}
