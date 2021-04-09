package com.ashsoft.beans;

public class Employee1 {

	private int eid;
	private String ename;
	private String eaddr;

	public Employee1(int eid, String ename, String eaddr) {
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddr=" + eaddr + "]";
	}
}
