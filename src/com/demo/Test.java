package com.demo;

public class Test {

	public static void main(String[] args) {
		ConcreteSubject center = new ConcreteSubject();
		ObserverOne o1 = new ObserverOne(center);
		ObserverTwo o2 = new ObserverTwo(center);
		center.getNewMessage("�㲥����,��һ�¹۲���1");
		center.notifyObservers();
	}

}
