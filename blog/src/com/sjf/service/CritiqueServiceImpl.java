package com.sjf.service;

import java.util.List;

import com.sjf.dao.CritiqueDAO;
import com.sjf.fenye.Page;
import com.sjf.fenye.PageUtil;
import com.sjf.fenye.Result;
import com.sjf.po.Article;
import com.sjf.po.Critique;

public class CritiqueServiceImpl implements CritiqueService{
	private CritiqueDAO critiqueDAO;
	
	public CritiqueDAO getCritiqueDAO() {
		return critiqueDAO;
	}

	public void setCritiqueDAO(CritiqueDAO critiqueDAO) {
		this.critiqueDAO = critiqueDAO;
	}

	public void addCritique(Critique critique) {
		critiqueDAO.addCritique(critique);
	}

	public Result showCritiqueByPage(int AId, Page page) {
		page = PageUtil.createPage(page, critiqueDAO.queryCritiqueCount(AId));
		List<Critique> all = critiqueDAO.queryByPage(AId, page);
		Result result = new Result();
		result.setPage(page);
		result.setList(all);
		return result;
	}

}
