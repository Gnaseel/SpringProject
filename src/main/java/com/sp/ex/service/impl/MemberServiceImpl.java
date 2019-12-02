package com.sp.ex.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sp.ex.MemberDAO;
import com.sp.ex.dto.MemberDTO;
import com.sp.ex.mapper.MemberMapper;
import com.sp.ex.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberMapper mapper;
	@Autowired
	private MemberDAO memberDAO;
	@Override
	public List<MemberDTO> viewAll() {
		return mapper.viewAll();
	}
	@Override
	public void insertMember(String id,String name, String pw) {	
		System.out.println("id = "+id+" name = "+name);

		HashMap<String, String> param = new HashMap();
		param.put("id",id);
		param.put("name",name);
		param.put("pw",pw);
		MemberDTO para = new MemberDTO(id,name,pw);
		memberDAO.memberInsert(para);
		return;
	}
	@Override
	public MemberDTO signUp(String id,String name, String pw) {
		MemberDTO dto = mapper.checkID(id);
		if(dto!=null) {
			System.out.println("�̹� ������ ����");
		} else if(dto==null) {
			System.out.println("ȸ�� ����");
			memberDAO.memberInsert(new MemberDTO(id,name,pw));
		}
		return dto;
	}
	@Override
	public boolean logIn(String id, String pw) {
		MemberDTO dto = mapper.checkID(id);
		if(dto==null||!dto.getPassword().equals(pw)) {
			System.out.println("���Ʋ���ų� ���� ����");
			return false;
		}else {
			System.out.println("��");
			return true;
		}
			
	}

}

