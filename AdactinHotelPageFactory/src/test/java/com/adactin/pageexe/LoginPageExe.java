package com.adactin.pageexe;

import com.adactin.base.BaseClass;
import com.adactin.locaters.BookHotelLocaters;
import com.adactin.locaters.LoginPageLocaters;

public class LoginPageExe extends BookHotelLocaters{
	public static void username_exe() {
		BaseClass.sendKeysData(new LoginPageLocaters().getUsername(), readProperty("username"));
	
	}
	
	public static void password_exe() {
		BaseClass.sendKeysData(new LoginPageLocaters().getPassword(), readProperty("password"));
	
	}
	
	public static void login_exe() {
		BaseClass.click_element(new LoginPageLocaters().getLogin());
	}

}
