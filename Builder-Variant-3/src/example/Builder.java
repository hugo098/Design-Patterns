package example;

import java.util.List;
import java.util.ArrayList;

public class Builder {

	private User user;

	public Builder(String id, String nick, String name) {
		this.user = new User();
		this.user.setId(id);
		this.user.setNick(nick);
		this.user.setName(name);
	}

	public Builder name(String name) {
		this.user.setName(name);
		return this;
	}

	public Builder familyName(String familyName) {
		this.user.setFamilyName(familyName);
		return this;
	}

	public Builder age(int age) {
		this.user.setAge(age);
		return this;
	}

	public Builder adult() {
		return this.age(18);
	}

	public Builder phone(int phone) {
		this.user.setPhone(phone);
		return this;
	}

	public Builder profession(String profession) {
		this.user.setProfession(profession);
		return this;
	}

	public Builder tag(String tag) {
		List<String> tags = new ArrayList<String>();
		if (this.user.getTags() == null) {			
			this.user.setTags(tags);			
		}
		tags=user.getTags();
		tags.add(tag);
		this.user.setTags(tags);
		return this;
	}

	public User build() {
		return this.user;
	}
}
