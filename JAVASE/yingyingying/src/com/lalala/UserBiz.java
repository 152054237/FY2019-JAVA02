package com.lalala;

public interface UserBiz {
	void register(String username,String password2,String name,String email) throws RegisterException; //�û�ע��
	void login(String username,String password) throws LoginException; //�û���¼
}
