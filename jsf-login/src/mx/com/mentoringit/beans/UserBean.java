package mx.com.mentoringit.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="user")
@SessionScoped

public class UserBean implements Serializable{
	
	private String name="";
	private String password;
	
	
	public String login()
	{
		String result="";
		if(name.length() > 0 && password.length() > 0) {
			System.out.println("message");
			result="wellcome";
		}else {
			System.out.println("message2");
			result="index";
		}
		return result;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
