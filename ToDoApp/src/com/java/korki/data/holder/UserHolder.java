package com.java.korki.data.holder;

import java.util.ArrayList;
import java.util.List;

import com.java.korki.data.model.user.User;
import com.java.korki.helper.NumberIdHelper;

public class UserHolder {

	private UserHolder instance = null;
	private List<User> users = new ArrayList<>();

	private NumberIdHelper idHelper;

	protected UserHolder() {
		idHelper = new NumberIdHelper();
	};

	protected UserHolder(long lastId) {
		idHelper = new NumberIdHelper(lastId);
	};

	public UserHolder getInstance() {
		if (instance == null) {
			//TODO: load users from file
			instance = new UserHolder();//TODO: call constructor with argument users.size()
		}
		return instance;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public NumberIdHelper getIdHelper() {
		return idHelper;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserHolder [instance=");
		builder.append(instance);
		builder.append(", users=");
		builder.append(users.toArray().toString());//TODO: check its working
		builder.append(", idHelper=");
		builder.append(idHelper);
		builder.append("]");
		return builder.toString();
	}

	
}
