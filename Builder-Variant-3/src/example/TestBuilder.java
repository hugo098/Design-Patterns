package example;

public class TestBuilder {

	public static void main(String[] args) {
		Builder b = new Builder("1", "hugo", "hugo");

		User user = b.age(18).phone(0005).profession("Professional").tag("TAG1").tag("TAG2").build();

		System.out.println(user);

	}

}
