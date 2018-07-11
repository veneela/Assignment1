package com.visam.javaexamples;

public class Triange {
	private String Type;
	private String name;
	public Triange(String name) {
		this.name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getName() {
		return name;
	}
	public void draw() {
		System.out.println(getType() +"  Triangle drawn");
	    System.out.println("Name is "+getName());
	}

}
