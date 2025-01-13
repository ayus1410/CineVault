package dev.ayush.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Document(collection = "reviews")
//@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

	@Id
	private ObjectId id;

	private String body;

	public Review(String body) {
		super();
		this.body = body;
	}

	public String getBody() {
		return body;
	}

	public ObjectId getId() {
		return id;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

}
