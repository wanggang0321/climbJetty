package com.luwak.jetty.demo.entity;

import java.util.Date;

/**
 * @author wanggang
 * @date 2018年5月2日 上午10:15:33
 * 
 */
public class User {
	
	private String name;
	private int age;
	private Date birthday;
	
	public User(String name, int age, Date birthday) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
