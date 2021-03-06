package com.sjf.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sjf.po.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	@Override
	public void add(User user) {
		this.getHibernateTemplate().save(user);
	}

	@Override
	public void delete(User user) {

	}

	@Override
	public void update(User user) {

	}

	@Override
	public List queryAll() {
		return null;
	}

	@Override
	public User queryByID(String username) {
		List list = this.getHibernateTemplate().find("select user from User user where user.username = '"+username+"'");
		if(list.size()==0){
			return null;
		}else{
			return (User)list.get(0);
		}
	}

}
