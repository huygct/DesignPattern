package com.fastcodevn.adapter.rocket;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
	private List<Fireable> fireables = new ArrayList<Fireable>();
	
	public void addFireable(Fireable fireable){
		fireables.add(fireable);
	}
	
	public void launch(){
		for(Fireable fireable: fireables){
			System.out.println("\nStarting " + fireable.getName());
			fireable.countDown();
			fireable.fire();
		}
		fireables.clear();
	}
}
