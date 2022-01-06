

public class UserValidation {

	public Users UserValidation(String username, String password) {

		for (Users user : Main.users) {
			if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				return user;
			}

		}
		return null;

	}
}