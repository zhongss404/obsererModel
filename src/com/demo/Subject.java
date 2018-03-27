package com.demo;

/**
 * 主题类
 * @author dashuai
 *
 */
public interface Subject {
	
	/**
	 * 添加观察者
	 * @param o
	 */
	public void addObserver(Observer o);
	
	/**
	 * 删除观察者
	 * @param o
	 */
	public void deleteObserver(Observer o);
	
	/**
	 * 通知所有的观察者
	 */
	public void notifyObservers();
}
