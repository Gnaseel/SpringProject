package com.sp.ex.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public interface OAuthService {
	public String getAccountID(String userID);	//����Ǿ��ִ� ���� ������ ������
	public String getClientID();				//oauth�� clinet id ��ȯ
	public String getClientSecret();			//oauth�� clinet secret ��ȯ
	public String getCodeURL();					//code ��ȯ
	public String getToken(HttpServletRequest request)throws Exception;	//token ��ȯ
	public List<String> getServices();			//�����ϰ��ִ� ���� ���� ����� ��ȯ
	String getAccessToken(String userID);
}
