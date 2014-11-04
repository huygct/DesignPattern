package com.tma.multithreads;

import java.awt.BorderLayout;
import java.awt.TextArea;

import javax.swing.JFrame;

public class InfoPanel extends JFrame implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int DEFAULT_WIDTH = 450;
	public static final int DEFAULT_HEIGHT = 350;
	
	private TextArea txtArea;

	public InfoPanel() {
		txtArea = new TextArea();
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setTitle("Info");
		add(txtArea, BorderLayout.CENTER);
	}

	@Override
	public void update(String name, double x, double y) {
			this.txtArea.setText(this.txtArea.getText() + "\n" + name + ": "
					+ x + " - " + y);
		
	}
}
