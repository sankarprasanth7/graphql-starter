package uk.co.benskin.graphql_spring_boot_tutorial.entities;

import lombok.Data;
import uk.co.benskin.graphql_spring_boot_tutorial.enums.Animal;

@Data
public class Pet {
    private long id;

    private String name;

    private Animal type;

    private int age;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the type
	 */
	public Animal getType() {
		return type;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Animal type) {
		this.type = type;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}