package userExample;

public class userExampleTest {

	public static void main(String[] args) {
	User user = User.builder().id("1").nick("hugo").name("Hugo").build();
	System.out.println(user);
	}

}
