package com.sjf.service;

import java.util.Date;

import com.sjf.dao.DianJiLiangDAO;
import com.sjf.po.DianJiLiang;

public class DianJiLiangServiceImpl implements DianJiLiangService{
	private DianJiLiangDAO dianJiLiangDAO;

	public DianJiLiangDAO getDianJiLiangDAO() {
		return dianJiLiangDAO;
	}

	public void setDianJiLiangDAO(DianJiLiangDAO dianJiLiangDAO) {
		this.dianJiLiangDAO = dianJiLiangDAO;
	}

	public boolean isVistor(int AId, String IP, Date time) {
		if(dianJiLiangDAO.queryByAId(AId, IP, time).size() != 0){
			//��ʾ�Ѿ��������
			return true;
		}else{
			//��ʾ�û�û�е����
			DianJiLiang djl = new DianJiLiang();
			djl.setAId(AId);
			djl.setIp(IP);
			djl.setTime(time);
			//�����¼
			dianJiLiangDAO.addJilu(djl);
			return false;
		}
	}

}