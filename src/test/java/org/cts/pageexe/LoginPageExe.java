package org.cts.pageexe;

import org.cucu.locators.Locators;

import com.cts.base.BaseClass;

public class LoginPageExe extends Locators{
	 public static void username(String user1) {
		 BaseClass.sendkeys(BaseClass.findElementname(Locators.username),user1); 
		 }

		public static void password(String pass1) {
			BaseClass.sendkeys(BaseClass.findElementname(Locators.password), pass1);
			
		}

		public static void loginbutton() {
			BaseClass.clickdata(BaseClass.findElementname(Locators.loginbutton));
			
		}


}
