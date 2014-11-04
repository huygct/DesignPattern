package com.tma.multithreads;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.Vector;

public class Ball implements Serializable, Subject {
	Vector<Observer> observers;
	/**
	 * 
	 */
	private static final long serialVersionUID = -2835829938975070158L;

	private static final int XSIZE = 15;
	private static final int YSIZE = 15;
	private static final double DEFAULT_V = 1;
	private double x;
	private double y;
	private double dx;
	private double dy;
	private String name;

	public Ball(String name, int frameWidth, int frameHeight) {
		this.x = (Math.random() * 1000) % frameWidth;
		this.y = (Math.random() * 1000) % frameHeight;
		this.dx = DEFAULT_V;
		this.dy = DEFAULT_V;
		observers = new Vector<Observer>();
		this.name = name;
	}

	/**
	 * Move the ball to next position. reversing if it hit one of the egdes
	 * 
	 * @param rectangle2d
	 */
	public void move(Rectangle2D rectangle2d, double time) {
		x += dx;
		y += dy;

		if (x < rectangle2d.getMinX()) {
			x = rectangle2d.getMinX();
			dx = -dx;
			updateObserver(x, y);
		}

		if (x + XSIZE >= rectangle2d.getMaxX()) {
			x = rectangle2d.getMaxX() - XSIZE;
			dx = -dx;
			updateObserver(x, y);
		}
		if (y < rectangle2d.getMinY()) {
			y = rectangle2d.getMinY();
			dy = -dy;
		}

		if (y + YSIZE >= rectangle2d.getMaxY()) {
			y = rectangle2d.getMaxY() - YSIZE;
			dy = -dy;
		}
	}

	/**
	 * Get shape of the ball at its current position
	 * 
	 * @return
	 */
	public Ellipse2D getShape() {
		return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void updateObserver(double x, double y) {
		for (Observer observer : observers) {
			observer.update(name, x, y);
		}
	}
}
