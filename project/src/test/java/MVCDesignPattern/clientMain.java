package MVCDesignPattern;

public class clientMain {

	public static void main(String[] args) {
		StudentModel sm = myFunction();
		StudentView sv = new StudentView();

		StudentController sc = new StudentController(sm,sv);
		
		sc.updateStudentView();
		sc.setStudentName("Jackychan");
		
		System.out.println("======== Updating View =====");
		sc.updateStudentView();
	}

	private static StudentModel myFunction() {
		StudentModel o = new StudentModel();
		o.setName("Sheetal");
		o.setRollNo("12311");
		return o;
	}
}
