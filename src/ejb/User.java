package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

@LocalBean
@Stateful
public class User {
	int id;
	String username;
	String password;
	public User() {
		super();
	}
	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	
	

}
