package com.sjf.dao;

import java.util.List;
import org.apache.tools.ant.taskdefs.FixCRLF.AddAsisRemove;
import com.sjf.po.User;

public interface UserDAO {
	//�����û�
	public void add(User user);
	//ɾ���û�
	public void delete(User user);
	//�����û�
	public void update(User user);
	//��ѯ�����û�
	public List queryAll();
	//����username��ѯ�û�
	public User queryByID(String username);	
	
}