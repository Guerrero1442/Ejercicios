package com.example.nutrients.model;

// "name": "Vitamin A",
// "rda": 900,
// "wiki": "https://en.wikipedia.org/wiki/Vitamin_A",
// "required": true,
// "type": "Vitamins",
// "tui": 3000package com.example.nutrients.model;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Vitamins")
public class Nutrient {
	
	//@Id
	private String _id;

	private String name;

	private int rda;

	private String wiki;

	private boolean required;

	private String type;

	private String tui;
	
	public Nutrient(){
		
	}

	public Nutrient(String _id, String name, int rda, String wiki, boolean required, String type, String tui) {
		this._id = _id;
		this.name = name;
		this.rda = rda;
		this.wiki = wiki;
		this.required = required;
		this.type = type;
		this.tui = tui;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRda() {
		return rda;
	}

	public void setRda(int rda) {
		this.rda = rda;
	}

	public String getWiki() {
		return wiki;
	}

	public void setWiki(String wiki) {
		this.wiki = wiki;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTui() {
		return tui;
	}

	public void setTui(String tui) {
		this.tui = tui;
	}

	
}
