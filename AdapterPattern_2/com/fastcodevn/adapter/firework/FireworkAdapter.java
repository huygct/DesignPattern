package com.fastcodevn.adapter.firework;

import com.fastcodevn.adapter.rocket.Fireable;

public class FireworkAdapter implements Fireable {

	private Firework firework;
	public FireworkAdapter(Firework firework) {
		this.firework = firework;
	}

	@Override
	public String getName() {
		return firework.getFireworkName() + " firework";
	}

	@Override
	public void countDown() {
		//do nothing, the firework does not need the countdown step
	}

	@Override
	public void fire() {
		firework.launchFirework();
	}

}
