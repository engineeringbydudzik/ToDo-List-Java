package com.java.korki.data.model.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import com.java.korki.data.holder.ProjectHolder;
import com.java.korki.data.model.project.task.Task;
import com.java.korki.data.model.user.User;
import com.java.korki.interfaces.GroupProject;

public abstract class Project implements GroupProject {
	private long id;
	private String name;
	private String password;
	private Type type;

	private Date startDate;
	private Date endDate;
	
	private ProjectHolder holder;

	private HashMap<Task, ArrayList<User>> taskUserMap;

	
	
	public Project(String name, String password) {
		this(name, password, Type.D, null, null);
	}
	
	public Project(String name, String password, Type type) {
		this(name, password, type, null, null);
	}
	
	public Project(String name, String password, Type type, Date startDate) {
		this(name, password, type, startDate, null);
	}

	public Project(String name, String password, Type type, Date startDate, Date endDate) {
		holder = holder.getInstance();
		id = holder.getIdHelper().getIdCounter();
		this.name = name;
		this.password = password;
		this.type = type;
		this.taskUserMap = new HashMap<Task, ArrayList<User>>();
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public HashMap<Task, ArrayList<User>> getTaskUserMap() {
		return taskUserMap;
	}

	public void setTaskUserMap(HashMap<Task, ArrayList<User>> taskUserMap) {
		this.taskUserMap = taskUserMap;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Project [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", password=");
		builder.append(password);
		builder.append(", taskUserMap=");
		builder.append(taskUserMap);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", endDate=");
		builder.append(endDate);
		builder.append("]");
		return builder.toString();
	}

	public ArrayList<User> getMembers() {
		HashMap<Task, ArrayList<User>> map = this.getTaskUserMap();
		HashSet<User> set = new HashSet<>();
		for (ArrayList<User> users : map.values()) {
			set.addAll(users);
		}
		ArrayList<User> listOfMembers = new ArrayList<>();

		for (User user : set) {
			listOfMembers.add(user);
		}

		return listOfMembers;
	}

	public User getMember(long id) throws Exception {
		ArrayList<User> memberList = getMembers();
		for (User user : memberList) {
			if (user.getId() == id) {
				return user;
			}
		}
		throw new Exception("User not found");
	}
}
