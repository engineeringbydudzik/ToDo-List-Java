package com.java.korki.data.holder;

import java.util.ArrayList;
import java.util.List;

import com.java.korki.data.model.project.task.Task;

public class TaskHolder {

	private TaskHolder instance = null;
	private List<Task> tasks = new ArrayList<>();

	protected TaskHolder() {
	};

	public TaskHolder getInstance() {
		if (instance == null) {
			instance = new TaskHolder();
		}
		return instance;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

}
