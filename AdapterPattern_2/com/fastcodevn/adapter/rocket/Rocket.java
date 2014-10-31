package com.fastcodevn.adapter.rocket;

public class Rocket implements Fireable {

	private String name;
	private int countDownTime;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void countDown() {
		for(int i = countDownTime; i >= 0; i--){
			System.out.println("\tCountdown: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void fire() {
		System.out.println(getName() + " fired");
	}

	public Rocket(String name, int countDownTime) {
		super();
		this.name = name;
		this.countDownTime = countDownTime;
	}

	
}
