package PrototypeDesignPattern;

public class PrototypeDPClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student obj1 = new Student("Jackychan", 1);
		
		Student obj2 = (Student) obj1.clone();
		Student obj3 = (Student) obj2.clone();
		
		obj2.setName("Olivia");
		obj3.setRollNo(6);
		
		System.out.println("Obj1 name = "+obj1.getName()+" Roll No "+obj1.getRollNo());
		System.out.println("Obj2 name = "+obj2.getName()+" Roll No "+obj2.getRollNo());
		System.out.println("Obj3 name = "+obj3.getName()+" Roll No "+obj3.getRollNo());
	}

}
