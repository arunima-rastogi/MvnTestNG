package MVCDesignPattern;

public class StudentController {

	private StudentModel sm;
	private StudentView sv;

	public StudentController(StudentModel sm, StudentView v) {
		this.sm = sm;
		this.sv = v;
	}

	public void setStudentName(String n) {
		sm.setName(n);
	}

	public void setStudentRollNo(String r) {
		sm.setRollNo(r);
	}

	public void updateStudentView() {
		sv.viewstudent(sm.getName(), sm.getRollNo());
	}
}
