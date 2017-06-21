package com.java.korki.data.model.project;

public enum Type {
	D("Default"), P("Programing"), A("Art"), O("Other");
	
	private String text;
	
	Type(String text){
		this.text = text;
	}
	
	public Type fromText(String text) {
		for (Type t : Type.values()) {
			if (t.text.toString().equalsIgnoreCase(text)) {
				return t;
			}
		}
		return D;
	}

}
