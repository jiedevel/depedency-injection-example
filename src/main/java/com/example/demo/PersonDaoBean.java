package com.example.demo;

public class PersonDaoBean implements PersonDao {

	private String msg="hello";
	
	
	PersonDaoBean (String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	@Override
	public void add() {
		System.out.println("add method in person dao bean");
		System.out.println("message is : " + this.msg);
	}
}

