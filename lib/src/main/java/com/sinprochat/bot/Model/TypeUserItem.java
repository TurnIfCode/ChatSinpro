package com.sinprochat.bot.Model;


public class TypeUserItem {
	private String id;
	private String type;
	
	public TypeUserItem(String id, String type) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.type = type;
	}
	
	public String getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
