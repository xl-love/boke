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
			//表示已经点击过了
			return true;
		}else{
			//表示用户没有点击过
			DianJiLiang djl = new DianJiLiang();
			djl.setAId(AId);
			djl.setIp(IP);
			djl.setTime(time);
			//保存记录
			dianJiLiangDAO.addJilu(djl);
			return false;
		}
	}

}
