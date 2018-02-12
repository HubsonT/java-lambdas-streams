package javabrains.unit1;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[" + firstName + "," + lastName + "," + age + "]";
	}

	// @Override
	// public String toString() {
	// ToStringBuilder builder = new ToStringBuilder(this,
	// ToStringStyle.NO_CLASS_NAME_STYLE);
	// return builder.append(firstName).append(lastName).append(age).toString();
	// }

}
