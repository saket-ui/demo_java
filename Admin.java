public class Admin extends User 
{
	public Admin(String userName,String password){
		super(userName,password);
	}
	//@ Override Method
	// Admin can View all student's details (Polymarphism)
	public void displayUserInfo(){
		super.displayUserInfo();
		System.out.println("Role: Admin");
	}
	//Admin can Added new Student (Functionality specific to admin)
	public void addStudent(Student student){
		System.out.println("Student "+ student.getName() + "has been added by admin.");
	}
}
