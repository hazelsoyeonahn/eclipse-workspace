package assignment1;
/*
 * This Paper class contains paper information.
 * It contains paper code, grade and paper completion status.
 */

public class Paper {
	//attributes
	private String code;
	private Grade grade;
	private boolean completed;
	
	//constructor
	public Paper(String code) {
		this.code = code;
		this.grade = null;
		this.completed = false;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Paper [code= " + code + ", grade= " + grade + ", completed= " + completed + "]";
	}
	
}
