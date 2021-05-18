package com.designpatterns.observerpattern.subject;

import com.designpatterns.observerpattern.observers.Observer;

public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}

