package com.vst.trc.model;

public class CustomerVO{

	private String custID;
	private String name;
	private int age;
	public String getCustID() {
		return custID;
	}
	public void setCustID(String custID) {
		this.custID = custID;
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
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", name=" + name + ", age=" + age + "]";
	}
	
}
