package a13_인터페이스2.model;

public class User {
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String username;
	private String password;
	private String name;
	private String email;
	
	public User() {
		
	}
	
	public void showUser() {
		System.out.println("User[username = " + username + ", password= " + password + ", name= " + name + ", email= " + email + "]");
	}
	
}
