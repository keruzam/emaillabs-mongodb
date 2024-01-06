package pl.keruzam.emaillabsmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("emails")
public class EmailData {

	@Id
	private String id;

	// @Indexed(unique = true)
	private String name;

	public EmailData(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ":" + name;
	}

}
