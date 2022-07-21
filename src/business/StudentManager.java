package business;

import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentManager {
	private List<Student> students = new ArrayList<>();

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Student> getStudent() {
		return students;
	}

}
