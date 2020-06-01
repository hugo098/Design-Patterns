package userExample;

public class userTest {

	public static void main(String[] args) {
		
		User user = User.builder("1", "hugo", "hugo").age(21).build();
		
		System.out.println(user);

	}

}
