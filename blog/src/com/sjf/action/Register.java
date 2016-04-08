package com.sjf.action;


import com.opensymphony.xwork2.ActionSupport;
import com.sjf.po.User;
import com.sjf.service.UserService;

public class Register extends ActionSupport{
	
	private String username;//�û���
	private String password;//����
	private String repassword;//ȷ������
	private String nickname;//�ǳ�
	private String question;//�ܱ�����
	private String answer;//�ܱ���
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
	//����У�鷽��
	/*public void validate() {
		if(username==null || "".equals(username.trim())){
			this.addFieldError("username", "�û�������Ϊ�գ�");
		}
		if(password==null || "".equals(password.trim())){
			this.addFieldError("password", "���벻��Ϊ�գ�");
		}
		if(repassword==null || "".equals(repassword.trim())){
			this.addFieldError("repassword", "ȷ�����벻��Ϊ�գ�");
		}
		if(nickname==null || "".equals(nickname.trim())){
			this.addFieldError("nickname", "�ǳƲ���Ϊ�գ�");
		}
		if(question==null || "".equals(question.trim())){
			this.addFieldError("question", "�ܱ����ⲻ��Ϊ�գ�");
		}
		if(answer==null || "".equals(answer.trim())){
			this.addFieldError("answer", "�ܱ��𰸲���Ϊ�գ�");
		}			
	}*/
	
	public String execute() throws Exception {
		//��װһ��user����
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setNickname(nickname);
		user.setQuestion(question);
		user.setAnswer(answer);
		
		if(userService.registerUser(user)){
			return SUCCESS;
		}else{
			return ERROR;
		}
		
	}
	
	
}