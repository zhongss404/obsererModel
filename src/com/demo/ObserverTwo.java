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
		System.out.println("我是观察者2,我收到的消息是：" + message);
	}

}
