package com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������
 * @author dashuai
 *
 */
public class ConcreteSubject implements Subject{
	
	private List<Observer> observers;  //��ע����Ĺ۲��ߵļ���
	
	private boolean needChange;  //��Ҫ����״̬
	
	private String message;      
	
	public ConcreteSubject(){
		observers = new ArrayList();
		needChange = false;
		message = "";
	}
	
	/**
	 * ��ӹ۲���
	 */
	@Override
	public void addObserver(Observer o) {
		if(!observers.contains(o)){
			observers.add(o);
		}
	}
	
	/**
	 * ɾ���۲���
	 */
	@Override
	public void deleteObserver(Observer o) {
		if(observers.contains(o)){
			observers.remove(o);
		}
	}
	
	/**
	 * ֪ͨ���й۲��߲��޸���״̬
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
		if(message.equals(newMessage)){ //����Ҫ����
			needChange = false;
		}else{  //��Ҫ֪ͨ���еĹ۲���
			message = newMessage;
			needChange = true;
		}
	}
}
