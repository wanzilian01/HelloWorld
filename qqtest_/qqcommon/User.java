package qqtest.qqcommon;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialversionUID = 1l;
	private String userId;
	private String passWd;
	
	public User() {}
	
	public User(String userId, String passWd) {
		this.userId = userId;
		this.passWd = passWd;
	}

	public String getUserId() {
		return userId;
	}

	public String getPassWd() {
		return passWd;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}
	
	
}
