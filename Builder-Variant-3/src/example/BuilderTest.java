package example;

public class BuilderTest {

	public static void main(String[] args) {
		
		Builder b = new Builder("1", "hugo", "hugo");
		
		User user= b.age(18).profession("technician").tag("TAG1").tag("TAG2").build();
		
		System.out.println(user);
		
		
		
	}

}
