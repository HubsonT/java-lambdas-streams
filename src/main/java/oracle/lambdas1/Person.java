package oracle.lambdas1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Person {
	private String givenName;
	private String surName;
	private int age;
	private Gender gender;
	private String eMail;
	private String phone;
	private String address;

	public static class Builder {
		private String givenName = "";
		private String surName = "";
		private int age = 0;
		private Gender gender = Gender.FEMALE;
		private String eMail = "";
		private String phone = "";
		private String address = "";

		public Person.Builder givenName(String givenName) {
			this.givenName = givenName;
			return this;
		}

		public Person.Builder surName(String surName) {
			this.surName = surName;
			return this;
		}

		public Person.Builder age(int age) {
			this.age = age;
			return this;
		}

		public Person.Builder gender(Gender gender) {
			this.gender = gender;
			return this;
		}

		public Person.Builder eMail(String eMail) {
			this.eMail = eMail;
			return this;
		}

		public Person.Builder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public Person.Builder address(String address) {
			this.address = address;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	private Person() {
		super();
	}

	private Person(Builder builder) {
		this.givenName = builder.givenName;
		this.surName = builder.surName;
		this.age = builder.age;
		this.gender = builder.gender;
		this.eMail = builder.eMail;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	@Override
	public String toString() {
		return "Name: " + givenName + " " + surName + "\n" + "Age: " + age + "  Gender: " + gender + "\n"
				+ "eMail: " + eMail + "\n" + "Address: " + address + "\n";
	}

	public String getGivenName() {
		return givenName;
	}

	public String getSurName() {
		return surName;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public String geteMail() {
		return eMail;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public void print() {
		System.out.println(
			"\nName: " + givenName + " " + surName + "\n"
					+ "Age: " + age + "\n"
					+ "Gender: " + gender + "\n"
					+ "eMail: " + eMail + "\n"
					+ "Phone: " + phone + "\n"
					+ "Address: " + address + "\n");
	}

	public void printName() {
		System.out.println("Name: " + givenName + " " + surName);
	}

	public static void printNamesFromTheList(List<Person> list) {
		list.stream().forEach(p -> System.out.println(p.getGivenName() + " " + p.getSurName()));
	}

	public void printWesternName() {

		System.out.println("\nName: " + this.getGivenName() + " " + this.getSurName() + "\n" +
				"Age: " + this.getAge() + "  " + "Gender: " + this.getGender() + "\n" +
				"EMail: " + this.geteMail() + "\n" +
				"Phone: " + this.getPhone() + "\n" +
				"Address: " + this.getAddress());
	}

	public void printEasternName() {

		System.out.println("\nName: " + this.getSurName() + " " + this.getGivenName() + "\n" +
				"Age: " + this.getAge() + "  " + "Gender: " + this.getGender() + "\n" +
				"EMail: " + this.geteMail() + "\n" +
				"Phone: " + this.getPhone() + "\n" +
				"Address: " + this.getAddress());
	}

	public String printCustom(Function<Person, String> f) {
		return f.apply(this);
	}

	public static List<Person> createShortList() {
		List<Person> people = new ArrayList<>();

		people.add(new Person.Builder()
			.givenName("Bob")
			.surName("Baker")
			.age(21)
			.gender(Gender.MALE)
			.eMail("bob.baker@example.com")
			.phone("201-121-4678")
			.address("44 4th St, Smallville, KS 12333")
			.build());
		people.add(
			new Person.Builder()
				.givenName("Jane")
				.surName("Doe")
				.age(25)
				.gender(Gender.FEMALE)
				.eMail("jane.doe@example.com")
				.phone("202-123-4678")
				.address("33 3rd St, Smallville, KS 12333")
				.build());

		people.add(
			new Person.Builder()
				.givenName("John")
				.surName("Doe")
				.age(25)
				.gender(Gender.MALE)
				.eMail("john.doe@example.com")
				.phone("202-123-4678")
				.address("33 3rd St, Smallville, KS 12333")
				.build());

		people.add(
			new Person.Builder()
				.givenName("James")
				.surName("Johnson")
				.age(45)
				.gender(Gender.MALE)
				.eMail("james.johnson@example.com")
				.phone("333-456-1233")
				.address("201 2nd St, New York, NY 12111")
				.build());

		people.add(
			new Person.Builder()
				.givenName("Joe")
				.surName("Bailey")
				.age(67)
				.gender(Gender.MALE)
				.eMail("joebob.bailey@example.com")
				.phone("112-111-1111")
				.address("111 1st St, Town, CA 11111")
				.build());

		people.add(
			new Person.Builder()
				.givenName("Phil")
				.surName("Smith")
				.age(55)
				.gender(Gender.MALE)
				.eMail("phil.smith@examp;e.com")
				.phone("222-33-1234")
				.address("22 2nd St, New Park, CO 222333")
				.build());

		people.add(
			new Person.Builder()
				.givenName("Betty")
				.surName("Jones")
				.age(85)
				.gender(Gender.FEMALE)
				.eMail("betty.jones@example.com")
				.phone("211-33-1234")
				.address("22 4th St, New Park, CO 222333")
				.build());
		return people;

	}

}
