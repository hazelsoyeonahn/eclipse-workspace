package assignment1;
/*
 * Student class contains student's information.
 * This class is also a parent class for StudentAmbassador and StudentMentor classes.
 * This class have name, id, gender, birthday, degree, paperList attributes.
 */

import java.util.ArrayList;

public class Student {
	//attributes
	public String name;
	private int id;
	private char gender;
	private String birthday;
	private String degree;
	private ArrayList<Paper> paperList = new ArrayList<Paper>();

	//constructor
	public Student(String name, int id, char gender, String birthday,String degree) {
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.birthday = birthday;
		this.degree = degree;
	}
	
	

	//this method enroll new paper. Add paper to the paperList
	public void addPaper(Paper paper) {
		paperList.add(paper);
	}
	//this method withdraw existing paper. Remove paper from the paperList
	public void withdrawPaper(Paper paper) {
		paperList.remove(paper);
	}
	//this method grade paper. If paper is graded, it must set to be completed.
	public void gradePaper(Paper paper,Grade grade) {
		paperList.get(paperList.indexOf(paper)).setGrade(grade);
		paperList.get(paperList.indexOf(paper)).setCompleted(true);;
	}
	
	public ArrayList<Paper> getPaperList(){
		return paperList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Student [name= " + name + ", id= " + id + ", gender= " + gender + ", birthday= " + birthday + ", degree= "
				+ degree + "]";
	}
	
	
}
