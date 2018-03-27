package com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题
 * @author dashuai
 *
 */
public class ConcreteSubject implements Subject{
	
	private List<Observer> observers;  //关注主题的观察者的集合
	
	private boolean needChange;  //需要更新状态
	
	private String message;      
	
	public ConcreteSubject(){
		observers = new ArrayList();
		needChange = false;
		message = "";
	}
	
	/**
	 * 添加观察者
	 */
	@Override
	public void addObserver(Observer o) {
		if(!observers.contains(o)){
			observers.add(o);
		}
	}
	
	/**
	 * 删除观察者
	 */
	@Override
	public void deleteObserver(Observer o) {
		if(observers.contains(o)){
			observers.remove(o);
		}
	}
	
	/**
	 * 通知所有观察者并修改其状态
	 */
	@Override
	public void notifyObservers() {
		if(needChange){
			for(Observer o : observers){
				o.updateState(this.message);
			}
		}
	}
	
	public void getNewMessage(String newMessage){
		if(message.equals(newMessage)){ //不需要更新
			needChange = false;
		}else{  //需要通知所有的观察者
			message = newMessage;
			needChange = true;
		}
	}
}
