package com.cadocx.noteapp;

public class Item {
	private int id;
	private String title;
	
	public Item(int id, String title) {
		this.id = id;
		this.title = title;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}

}
