package io.yoshizaki;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Objects;

public class Person {
	private String firstName;
	private String lastName;
	private String hobby;
	private String favoriteFood;

	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
		//if (this == o) return true;
		//if (!(o instanceof Person)) return false;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (!(o instanceof Person)) return false;

		Person person = (Person) o;

		return new EqualsBuilder()
				.append(firstName, person.firstName)
				.append(lastName, person.lastName)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37)
				.append(firstName)
				.append(lastName)
				.toHashCode();
	}

	@Override
	public String toString() {
		return "Person{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", hobby='" + hobby + '\'' +
				", favoriteFood='" + favoriteFood + '\'' +
				'}';
	}
}