package com.sjf.action;


import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sjf.po.User;
import com.sjf.service.UserService;

public class Register extends ActionSupport{
	
	private String username;//用户名
	private String password;//密码
	private String repassword;//确认密码
	private String nickname;//昵称
	private String question;//密保问题
	private String answer;//密保答案
	private String address;//地址
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
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
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
		
	
	
	
	public String execute() throws Exception {
		//封装一个user对象 
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setNickname(nickname);
		user.setQuestion(question);
		user.setAnswer(answer);
		user.setAddress(address);
		//获得request
		HttpServletRequest request = ServletActionContext.getRequest();
		
		if(userService.registerUser(user)){
			request.setAttribute("url", "login.jsp");
			request.setAttribute("info", "注册成功");
			return SUCCESS;
		}else{
			request.setAttribute("url", "register.jsp");
			request.setAttribute("info", "注册失败");
			return ERROR;
		}
		
	}
	
	
}
