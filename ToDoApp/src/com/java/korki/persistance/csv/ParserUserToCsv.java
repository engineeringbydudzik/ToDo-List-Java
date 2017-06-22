package com.java.korki.persistance.csv;

import com.java.korki.data.model.user.User;
import com.java.korki.interfaces.CsvPersistable;

public class ParserUserToCsv implements CsvPersistable {

	private User user;

	public ParserUserToCsv(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public String getCsvLine() {
		StringBuilder builder = new StringBuilder();
		builder.append(user.getId());
		builder.append(";");
		builder.append(user.getUsername());
		builder.append(";");
		builder.append(user.getPassword());
		return builder.toString();
	}

}
