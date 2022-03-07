package com.coderscampus.Week14.dto;

import java.util.Objects;

public class Person {

	private Long personId;
	private String name;
	private String gender;
	private Integer age;
	
	
	
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(personId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(personId, other.personId);
	}
	
	
	
}
