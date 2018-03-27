package com.demo;

public interface Observer {
	/**
	 * 更新观察者的状态
	 * @param message
	 */
	public void updateState(String message);
}
