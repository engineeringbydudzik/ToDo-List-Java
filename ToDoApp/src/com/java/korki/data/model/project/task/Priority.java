package com.java.korki.data.model.project.task;

public enum Priority {
	D("Default"), L("Low"), N("Normal"), H("High");

	private String text;

	Priority(String text) {
		this.text = text;
	}

	public Priority fromText(String text) {
		for (Priority p : Priority.values()) {
			if (p.text.toString().equalsIgnoreCase(text)) {
				return p;
			}
		}

		return D;
	}

}
