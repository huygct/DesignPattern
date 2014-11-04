package com.tma.multithreads;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BounceFrameMultiBall extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6619494923459864961L;
	private int numBall;

	public static final int DEFAULT_WIDTH = 450;
	public static final int DEFAULT_HEIGHT = 350;
	public static final int STEPS = 1000;
	public static final int DELAY = 2;

	private BallComponent comp;
	private InfoPanel infoPanel;

	public BounceFrameMultiBall() {
		numBall = 0;
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		JPanel buttonPanel = new JPanel();
		setTitle("Bounce");

		comp = new BallComponent();
		infoPanel = new InfoPanel();
		add(comp, BorderLayout.CENTER);

		addButton(buttonPanel, "Start", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addBall();
			}
		});

		addButton(buttonPanel, "Close", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		infoPanel = new InfoPanel();
		infoPanel.setVisible(true);
		add(buttonPanel, BorderLayout.SOUTH);
	}

	private void addButton(Container c, String title,
			ActionListener actionListener) {
		JButton button = new JButton(title);
		c.add(button);
		button.addActionListener(actionListener);
	}

	private void addBall() {
		Ball ball = new Ball(numBall + "",DEFAULT_WIDTH, DEFAULT_HEIGHT);
		ball.registerObserver(infoPanel);
		comp.add(ball);
		Runnable runnable = new BallRunnable(comp, ball);
		Thread thread = new Thread(runnable);
		thread.start();
		numBall++;
	}
}
