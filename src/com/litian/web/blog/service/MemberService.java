package com.litian.web.blog.service;

import com.litian.web.blog.constant.WebConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litian.web.blog.entity.MemberBean;
import com.litian.web.blog.mapper.MemberMapper;
import com.litian.web.blog.service.i.IMemberService;

@Service
public class MemberService implements IMemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public MemberBean addMember(MemberBean memberBean) {
        memberMapper.insert(memberBean);
        return memberBean;
    }

    @Override
    public MemberBean getMemberById(Long id) {
        return memberMapper.queryMemberById(id);
    }

    @Override
    public MemberBean getMemberByPhone(Long phone) {
        return memberMapper.queryMemberByPhone(phone);
    }

    @Override
    public MemberBean getMemberByMail(String mail) {
        return memberMapper.queryMemberByMail(mail);
    }

    @Override
    public MemberBean getMemberByName(String name) {
        return memberMapper.queryMemberByName(name);
    }

    @Override
    public MemberBean getMemberByUsername(String username) {
        if (username == null) return null;
        MemberBean member;
        if (username.matches(WebConstant.REGEX_MOBILE))
            member = getMemberByPhone(Long.valueOf(username));
        else if (username.matches(WebConstant.REGEX_MAIL))
            member = getMemberByMail(username);
        else member = getMemberByName(username);
        return member;
    }

}
