package com.litian.web.blog.service.i;

import com.litian.web.blog.entity.MemberBean;

public interface IMemberService {
    MemberBean addMember(MemberBean memberBean);
    MemberBean getMemberById(Long id);
    MemberBean getMemberByPhone(Long phone);
    MemberBean getMemberByMail(String mail);
    MemberBean getMemberByName(String name);
    MemberBean getMemberByUsername(String username);
}
