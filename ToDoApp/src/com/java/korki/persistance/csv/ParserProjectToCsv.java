package com.java.korki.persistance.csv;

import com.java.korki.data.model.project.Project;
import com.java.korki.interfaces.CsvPersistable;

public class ParserProjectToCsv implements CsvPersistable {
	
	private Project project;

	public ParserProjectToCsv(Project project) {
		this.project = project;
	}

	public Project getProject() {
		return project;
	}
	
	public String getCsvLine() {
		StringBuilder builder = new StringBuilder();
		builder.append(project.getId());
		builder.append(";");
		builder.append(project.getName());
		builder.append(";");
		builder.append(project.getPassword());
		builder.append(";");
		builder.append(project.getType());
		builder.append(";");
		builder.append(project.getStartDate());
		builder.append(";");
		builder.append(project.getEndDate());
		return builder.toString();
	}
	
}
