package PrototypeDesignPattern;

public class Student implements Cloneable {

	private String name;
	private int rollNo;
	
	public Student(String n, int r) {
		this.name = n;
		this.rollNo = r;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		String n = this.getName();
		int r = this.getRollNo();
		
		return new Student(n,r);
	}

}
