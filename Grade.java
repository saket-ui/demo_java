public class Grade 
{
	private double marks;
	public Grade(double marks){
		this.marks=marks;
	}
	//Calculate Grade Bassed on Marks::
	public String calculateGrade(){
		if(marks>=90){
			return "A";
		} else if(marks>=80){
			return "B";
		} else if(marks>=70){
			return "C";
		} else if(marks>=60){
			return "D";
		} else{
			return "F";
		}
	}
	public double getMarks(){
		return marks;
	}
	public void setMarks(double marks){
		this.marks=marks;
	}
}
