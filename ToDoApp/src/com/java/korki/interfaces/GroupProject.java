package com.java.korki.interfaces;

import java.util.ArrayList;

import com.java.korki.data.model.user.User;

public interface GroupProject {

	public static final byte MAX_USERS_IN_GROUP_PROJECT = 16;

	public ArrayList<User> getMembers();

	public User getMember(long id) throws Exception;

}
