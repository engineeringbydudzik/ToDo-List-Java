package com.java.korki.data.holder;

import java.util.List;

import com.java.korki.data.model.project.Project;
import com.java.korki.helper.NumberIdHelper;

public class ProjectHolder {

	private static ProjectHolder instance = null;
	private List<Project> projects;
	
	private NumberIdHelper idHelper;

	protected ProjectHolder() {
		this(0);
	};

	protected ProjectHolder(long lastId) {
		idHelper = new NumberIdHelper(lastId);
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

	public NumberIdHelper getIdHelper() {
		return idHelper;
	}
	
	

}
