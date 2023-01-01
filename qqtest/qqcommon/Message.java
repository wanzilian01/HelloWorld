package qqtest.qqcommon;

import java.io.Serializable;

public class Message implements Serializable{
	private static final long serialversionUID = 1l;
	private String sender;
	private String getter;
	private String content;
	private String sendTime;
	private String mesType;
	
	public String getSender() {
		return sender;
	}
	public String getGetter() {
		return getter;
	}
	public String getContent() {
		return content;
	}
	public String getSendTime() {
		return sendTime;
	}
	public String getMesType() {
		return mesType;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public void setGetter(String getter) {
		this.getter = getter;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public void setMesType(String mesType) {
		this.mesType = mesType;
	}
	
}
