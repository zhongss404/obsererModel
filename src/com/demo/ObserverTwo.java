package com.demo;

public class ObserverTwo implements Observer {

	private Subject subject;
	
	public ObserverTwo(){}
	
	public ObserverTwo(Subject subject){
		this.subject = subject;
		subject.addObserver(this);
	}
	
	@Override
	public void updateState(String message) {
		System.out.println("���ǹ۲���2,���յ�����Ϣ�ǣ�" + message);
	}

}
