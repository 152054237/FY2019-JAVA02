package com.liergou.view;
import com.liergou.pojo.*;
public interface UserView {
	void welcome();
	void choice();
	void login(Admin[] admins);
	void logi(Admin[] admins);
	void look();
	void show();
	void add();
	void delete();
	void change();
}
