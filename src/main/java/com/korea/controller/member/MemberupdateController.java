package com.korea.controller.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.korea.controller.SubController;

public class MemberupdateController implements SubController {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
		// 파라미터 받기
		
		// 입력값 확인
		
		// 서비스 실행
		
		// View
		try {
			req.getRequestDispatcher("/WEB-INF/member/password.jsp").forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
