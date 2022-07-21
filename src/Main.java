import business.CourseManager;
import business.StudentManager;
import model.Category;
import model.Course;
import model.Instructor;
import model.Student;
import model.User;

public class Main {

	public static void main(String[] args) {
		Category category=new Category(1,"programlama");
		Instructor instructor=new Instructor(1,"Engin","Demiroğ");
		Course course=new Course(1,"Java ile Programlamaya Giriş",instructor, category);
		User user=new User(1,"rabiacakir","123456");
		Student student1=new Student(1,"Rabia","Çakır",course);
		Student student2=new Student(2,"Ali","Demir",course);
		
		StudentManager studentManager=new StudentManager();
		studentManager.addStudent(student1);
		studentManager.addStudent(student2);
		
		for(Student student:studentManager.getStudent())
		{
			System.out.println(student.getId());
			System.out.println(student.getFirstName());
			System.out.println(student.getLastName());
			System.out.println(student.getCourse().getName());
		}
		
		CourseManager courseManager=new CourseManager();
		courseManager.addCourse(course);
		for(Course course_:courseManager.getCourse())
		{
			System.out.println(course_.getId());
			System.out.println(course_.getName());
			System.out.println(course_.getCategory().getName());
			System.out.println(course_.getInstructor().getFirstName()+" "+course_.getInstructor().getLastName());
		}
		
		
	}

}
