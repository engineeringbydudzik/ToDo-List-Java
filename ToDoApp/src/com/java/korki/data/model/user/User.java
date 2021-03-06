package com.java.korki.data.model.user;

import com.java.korki.data.holder.UserHolder;

public class User {
	private long id;
	private String username;
	private String password;

	private UserHolder holder;
	
	public User(String username, String password) {
		holder = holder.getInstance();
		this.id = holder.getIdHelper().getIdCounter();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("User [id=");
		buffer.append(id);
		buffer.append(", username=");
		buffer.append(username);
		buffer.append(", password=");
		buffer.append(password);
		buffer.append("]");
		return buffer.toString();
	}

}
