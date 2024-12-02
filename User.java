public class User 
{
	private String userName;
	private String password;
	public User(String userName,String password){
		this.userName=userName;
		this.password=password;
	}
	public String getUserName(){
		return userName;
	}
	public String getPassword(){
		return password;
	}
	public void displayUserInfo(){
		System.out.println("User Name::"+ userName);
	}
}
	
