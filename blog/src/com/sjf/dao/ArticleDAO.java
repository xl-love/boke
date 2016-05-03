package com.sjf.dao;

import java.util.List;

import com.sjf.fenye.Page;
import com.sjf.po.Article;

public interface ArticleDAO {
	//����һ��add�����������沩������
	public void add(Article article);
	//����һ��queryUserAll,����ȡ���û����е�����
	public List<Article> queryUserAll(String username);
	//��ȡ�û����¼�¼����
	public int queryUserAllCount(String username);
	//����ҳ��Ϣ��ѯ�û���¼
	public List<Article> queryByPage(String username,Page page);
	//����������µ��ܼ�¼��
	public int queryAllCount();
	//����ҳ��Ϣ��ѯ��¼
	public List<Article> queryAllByPage(Page page);
	//��id��ѯ����
	public Article queryById(int id);
}