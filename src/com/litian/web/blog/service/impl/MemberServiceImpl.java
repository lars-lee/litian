package com.litian.web.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litian.web.blog.entity.MemberBean;
import com.litian.web.blog.mapper.MemberMapper;
import com.litian.web.blog.service.IMemberService;

@Service
public class MemberServiceImpl implements IMemberService{

	@Autowired
	private MemberMapper memberDao;
	public String sayHello() {
		MemberBean bean = memberDao.queryMemberById(1L);
		System.out.println(bean);
return "hello";
	}

}
