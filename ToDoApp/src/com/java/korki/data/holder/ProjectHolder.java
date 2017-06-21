package com.java.korki.data.holder;

import java.util.List;

import com.java.korki.data.model.project.Project;

public class ProjectHolder {

	private static ProjectHolder instance = null;
	private List<Project> projects;

	protected ProjectHolder() {
	};

	public ProjectHolder getInstance() {
		if (instance == null) {
			instance = new ProjectHolder();
		}
		return instance;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
