package com.java.korki.persistance.csv;

import com.java.korki.data.model.project.task.Task;
import com.java.korki.interfaces.CsvPersistable;

public class ParserTaskToCsv implements CsvPersistable {
	
	private Task task;

	public ParserTaskToCsv(Task task) {
		this.task = task;
	}

	public Task getTask() {
		return task;
	}
	
	public String getCsvLine(){
		StringBuilder builder = new StringBuilder();
		builder.append(task.getId());
		builder.append(";");
		builder.append(task.getDescription());
		builder.append(";");
		builder.append(task.getPriority());
		return builder.toString();
	}

}
