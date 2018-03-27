package com.demo;

public class Test {

	public static void main(String[] args) {
		ConcreteSubject center = new ConcreteSubject();
		ObserverOne o1 = new ObserverOne(center);
		ObserverTwo o2 = new ObserverTwo(center);
		center.getNewMessage("广播找人,找一下观察者1");
		center.notifyObservers();
	}

}
