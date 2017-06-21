package com.java.korki.data.holder;

import java.util.ArrayList;
import java.util.List;

import com.java.korki.data.model.user.User;

public class UserHolder {
	
	private UserHolder instance = null;
	private List<User> users = new ArrayList<>();
	
	protected UserHolder(){};
	
	public UserHolder getInstance(){
		if(instance == null) {
			instance = new UserHolder();
		}
		return instance;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
