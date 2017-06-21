package com.java.korki.data.model.project;

import java.util.Date;

public class DefaultProject extends Project {

	private String topic;

	public DefaultProject(String name, String password, Date startDate) {
		this(name, password, startDate, null, "Not sepcified");
	}

	public DefaultProject(String name, String password, Date startDate,
			String topic) {
		this(name, password, startDate, null, topic);
	}

	public DefaultProject(String name, String password, Date startDate,
			Date endDate, String topic) {
		super(name, password, startDate, endDate);
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DefaultProject [topic=");
		builder.append(topic);
		builder.append(", getId()=");
		builder.append(getId());
		builder.append(", getName()=");
		builder.append(getName());
		builder.append(", getPassword()=");
		builder.append(getPassword());
		builder.append(", getTaskUserMap()=");
		builder.append(getTaskUserMap());
		builder.append(", getStartDate()=");
		builder.append(getStartDate());
		builder.append(", getEndDate()=");
		builder.append(getEndDate());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getMembers()=");
		builder.append(getMembers());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append("]");
		return builder.toString();
	}

}
