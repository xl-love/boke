package com.sjf.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sjf.po.BlogInfo;
import com.sjf.service.BlogInfoService;

public class GetBlogInfo extends ActionSupport {
	public BlogInfoService blogInfoService;

	public BlogInfoService getBlogInfoService() {
		return blogInfoService;
	}

	public void setBlogInfoService(BlogInfoService blogInfoService) {
		this.blogInfoService = blogInfoService;
	}

	public String execute() throws Exception {
		//获得username
		Map session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");
		
		//通过业务逻辑组件来查询
		BlogInfo blogInfo = blogInfoService.getBlogInfo(username);
		if(blogInfo != null){
			session.put("blogtitle", blogInfo.getBlogtitle());
			session.put("idiograph", blogInfo.getIdiograph());
		}
		return this.SUCCESS;
	}
	 
}
