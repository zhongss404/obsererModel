package com.demo;

/**
 * ������
 * @author dashuai
 *
 */
public interface Subject {
	
	/**
	 * ��ӹ۲���
	 * @param o
	 */
	public void addObserver(Observer o);
	
	/**
	 * ɾ���۲���
	 * @param o
	 */
	public void deleteObserver(Observer o);
	
	/**
	 * ֪ͨ���еĹ۲���
	 */
	public void notifyObservers();
}
