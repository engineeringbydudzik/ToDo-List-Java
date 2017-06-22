package com.java.korki.data.holder;

import java.util.ArrayList;
import java.util.List;

import com.java.korki.data.model.project.task.Task;
import com.java.korki.helper.NumberIdHelper;

public class TaskHolder {

	private TaskHolder instance = null;
	private List<Task> tasks = new ArrayList<>();

	private NumberIdHelper idHelper;

	protected TaskHolder() {
		idHelper = new NumberIdHelper();
	};

	protected TaskHolder(long lastId) {
		idHelper = new NumberIdHelper(lastId);
	};
	
	public TaskHolder getInstance() {
		if (instance == null) {
			//TODO: load tasks from file
			instance = new TaskHolder();//TODO: call constructor with argument users.size()
		}
		return instance;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	public NumberIdHelper getIdHelper() {
		return idHelper;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TaskHolder [instance=");
		builder.append(instance);
		builder.append(", tasks=");
		builder.append(tasks.toArray().toString());
		builder.append(", idHelper=");
		builder.append(idHelper);
		builder.append("]");
		return builder.toString();
	}

	
}
