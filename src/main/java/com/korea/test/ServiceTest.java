package com.korea.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.korea.dto.MemberDTO;
import com.korea.service.MemberService;

public class ServiceTest {

	@Test
	public void test() {
		MemberDTO dto = new MemberDTO();
		dto.setEmail("example2@example.com");
		dto.setPwd("1234");
		dto.setAddr1("대구");
		dto.setAddr2("대구");
		
		MemberService service = MemberService.getInstance();
		service.MemberInsert(dto);
	}
	
	@Test
	public void Test2() {
		MemberDTO dto = new MemberDTO();
		dto.setEmail("admin@admin.com");
		dto.setPwd("1234");
		dto.setAddr1("");
		dto.setAddr2("");
		dto.setGrade(2);
		
		MemberService service = MemberService.getInstance();
		service.MemberInsert(dto); //관리자 계정 등록
		
		dto.setEmail("guest@guest.com");
		dto.setPwd("1234");
		dto.setAddr1("");
		dto.setAddr2("");
		dto.setGrade(0);
		
		service.MemberInsert(dto);
	
	}
	
	

}
