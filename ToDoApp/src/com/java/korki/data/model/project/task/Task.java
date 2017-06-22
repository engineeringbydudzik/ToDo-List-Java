package com.java.korki.data.model.project.task;

import com.java.korki.data.holder.TaskHolder;

public class Task {
	private long id;
	private String description;
	private Priority priority;
	private boolean done;
	private TaskHolder holder;

	public Task(String description, Priority priority, boolean done) {
		holder = holder.getInstance();
		id = holder.getIdHelper().getIdCounter();
		this.description = description;
		this.priority = priority;
		this.done = done;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
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
		Task other = (Task) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Task [id=");
		builder.append(id);
		builder.append(", description=");
		builder.append(description);
		builder.append(", priority=");
		builder.append(priority);
		builder.append(", done=");
		builder.append(done);
		builder.append("]");
		return builder.toString();
	}

}
