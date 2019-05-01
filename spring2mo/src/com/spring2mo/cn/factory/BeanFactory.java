package com.spring2mo.cn.factory;

public interface BeanFactory {

	
	public Object getBean(String name);
	
	public <T> T getBean(String name, Class<T> T);
	
	public <T> T getBean(Class<T> T);
}
