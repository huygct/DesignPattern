package com.fastcodevn.adapter.firework;

public class Firework {
	private String name;
	private String color;
	
	public Firework(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	public void launchFirework(){
		System.out.println(color + name + " firework is launched");
	}
	
	public String getFireworkName(){
		return name;
	}
	
	public String getFireworkColor(){
		return color;
	}
}
