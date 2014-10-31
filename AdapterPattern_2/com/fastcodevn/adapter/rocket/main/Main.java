package com.fastcodevn.adapter.rocket.main;

import com.fastcodevn.adapter.firework.Firework;
import com.fastcodevn.adapter.firework.FireworkAdapter;
import com.fastcodevn.adapter.rocket.Launcher;
import com.fastcodevn.adapter.rocket.Rocket;

public class Main {
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.addFireable(new Rocket("Shark Roket", 5));
		
		Firework firework1 = new Firework("Square", "Yellow");
		FireworkAdapter fireworkAdapter1 = new FireworkAdapter(firework1);
		launcher.addFireable(fireworkAdapter1);
		
		launcher.addFireable(new Rocket("Patriot Rocket", 2));
		
		Firework firework2 = new Firework("Flower", "Blue");
		FireworkAdapter fireworkAdapter2 = new FireworkAdapter(firework2);
		launcher.addFireable(fireworkAdapter2);
		
		launcher.addFireable(new Rocket("Turtle Rocket", 100));
		
		launcher.launch();
	}
}
