package com.spring.test.domain;

import java.util.Date;

public class BoardVO {
	private String id;
	private String pw;
	private String name;
	private String phone;
	private Date regDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "BoardVO [idx=" + id + ", title=" + pw + ", name=" + name + ", phone=" + phone + ", regDate="
				+ regDate + "]";
	}

	
}