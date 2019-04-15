package com.power.using.action;

import com.opensymphony.xwork2.ActionSupport;

public class Demo2Action extends ActionSupport {
	
	public String addUI(){
		return SUCCESS;
	}
	
	public String editUI(){
		return ERROR;
	}

}
