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
		System.out.println("我是观察者1,我收到的消息是：" + message);
	}

}
