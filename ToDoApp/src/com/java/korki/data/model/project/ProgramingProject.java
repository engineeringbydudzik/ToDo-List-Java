package com.java.korki.data.model.project;

import java.util.Date;

public class ProgramingProject extends Project {

	private String mainProgramingLanguage;

	public ProgramingProject(String name, String password, Date endDate,
			String mainProgramingLanguage) {
		super(name, password, endDate);
		this.mainProgramingLanguage = mainProgramingLanguage;
	}

	public String getMainProgramingLanguage() {
		return mainProgramingLanguage;
	}

	public void setMainProgramingLanguage(String mainProgramingLanguage) {
		this.mainProgramingLanguage = mainProgramingLanguage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProgramingProject [mainProgramingLanguage=");
		builder.append(mainProgramingLanguage);
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
