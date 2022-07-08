package com.korea.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.korea.controller.SubController;

public class NoticePostController  implements SubController{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		try {
			req.getRequestDispatcher("/WEB-INF/notice/post.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
