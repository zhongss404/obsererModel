package com.demo;

public class ObserverOne implements Observer {

	private Subject subject;
	
	public ObserverOne(){}
	
	public ObserverOne(Subject subject){
		this.subject = subject;
		subject.addObserver(this);
	}
	
	@Override
	public void updateState(String message) {
		System.out.println("���ǹ۲���1,���յ�����Ϣ�ǣ�" + message);
	}

}
