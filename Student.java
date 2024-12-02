public class Student
{
	private String name;
	private int age;
	private String id;
	public Student(String name,int age,String id){
		this.name=name;
		this.age=age;
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getId(){
		return id;
	}
	public void displayStudentData(){
		
	System.out.println("Student Name::"+ name);
	System.out.println("Student Age::"+ age);
	System.out.println("Student Id::"+ id);
	}
}
		


		


	
