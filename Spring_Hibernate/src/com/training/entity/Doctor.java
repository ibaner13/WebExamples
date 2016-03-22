package com.training.entity;

public class Doctor {

	private int docId;
	private String docName;

	public Doctor() {
		super();
	}

	public Doctor(int docId, String docName) {
		super();
		this.docId = docId;
		this.docName = docName;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", docName=" + docName + "]";
	}

}
