import java.util.ArrayList;
import java.util.List;
public class StudentManagementSystem
{
	private List<Student> students;
	private Admin admin;
	public StudentManagementSystem(Admin admin){
		this.students=new ArrayList<>();
		this.admin=admin;
	}
	// Method to add a Student (admin only)
	public void addStudent(Student student){
		admin.addStudent(student);
		//students.add(student);
	}
	//Display All Students
	public void displayAllStudents(){
		System.out.println("Student List::");
		for(Student student:students){
			student.displayStudentData();
			System.out.println("Grade::"+new Grade(85).calculateGrade());
			System.out.println("-------------------------");
		}
	}
	public static void main(String[] args) 
	{
		//Create an admin user
		Admin admin=new Admin("Saket","saket@222");
		//Create the Student Management Student::
		StudentManagementSystem sms=new StudentManagementSystem(admin);
		// Create Students
		Student student1=new Student("Raja",20,"111");
		Student student2=new Student("Rani",18,"222");
		//Admin adds Student
		sms.addStudent(student1);
		sms.addStudent(student2);
		//Display all Students Dteails::
		sms.displayAllStudents();
	}
}
