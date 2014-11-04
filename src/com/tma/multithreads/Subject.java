package com.tma.multithreads;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void updateObserver(double x, double y);
}
