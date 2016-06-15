package com.litian.web.blog.mapper;

import com.litian.web.blog.entity.MemberBean;

public interface MemberMapper {
	int insert(MemberBean memberBean);
	MemberBean queryMemberById(Long id);
	MemberBean queryMemberByPhone(Long phone);
	MemberBean queryMemberByMail(String mail);
	MemberBean queryMemberByName(String name);

}
