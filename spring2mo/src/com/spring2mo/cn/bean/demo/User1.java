package com.spring2mo.cn.bean.demo;

import com.spring2mo.cn.factory.DefaultBeanFactory;

public class User1 {
	
	public void say() {
		System.out.println("I am User1");
	}
	
	public static void main(String[] args) {
		
		DefaultBeanFactory factory = new DefaultBeanFactory();
		factory.addModel("user1", "com.spring2mo.cn.bean.demo.User1", "sington");
		factory.addModel("user2", "com.spring2mo.cn.bean.demo.User2", null);
		User1 user = factory.getBean("user1", User1.class);
		user.say();
		User1 user1 = factory.getBean("user1", User1.class);
		user1.say();
		System.out.println("this is singeton implements? " + (user == user1 ? "yes" : "no"));
		
		User2 user3 = factory.getBean("user2", User2.class);
		user.say();
		User2 user4 = factory.getBean("user2", User2.class);
		user1.say();
		System.out.println("this is singeton implements? " + (user3 == user4 ? "yes" : "no"));
		
	}

}
